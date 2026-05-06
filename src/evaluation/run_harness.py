from __future__ import annotations

import argparse
import json
import os
import queue
import re
import shutil
import subprocess
import sys
import threading
import time
import xml.etree.ElementTree as ET
from concurrent.futures import ThreadPoolExecutor, as_completed
from dataclasses import dataclass, field
from pathlib import Path
from typing import Callable, Optional

from .schema import MutantRecord, append_jsonl

"""
Unified mutant evaluation harness for sweagent / bugfarm / LEAM.

For each mutant:
  apply (in-memory) -> mvn test -> parse surefire -> restore (in-memory) -> emit record

Usage:
    python3 -m src.evaluation.run_harness --project commons-cli --tools sweagent,bugfarm,leam --workers 8
"""

REPO_ROOT = Path(__file__).resolve().parents[2]

PROJECT_DIRS = {
    "commons-cli": REPO_ROOT / "defects4j-subset" / "Cli-40f",
    "commons-csv": REPO_ROOT / "defects4j-subset" / "Csv-16f",
}

PROJECT_SHORT = {"commons-cli": "cli", "commons-csv": "csv"}

DEFAULT_WORKERS = 8
DEFAULT_TIMEOUT = 240  # seconds per mvn test invocation

MAVEN_FLAGS = [
    "-q",
    "-o",
    "-DskipITs=true",
    "-Dmaven.test.failure.ignore=true",
    "-Drat.skip=true",
    "-Dcheckstyle.skip=true",
    "-Denforcer.skip=true",
    "-Dpmd.skip=true",
    "-Dspotbugs.skip=true",
    "-Danimal.sniffer.skip=true",
    "-Djacoco.skip=true",
    "-DforkCount=1",
    "-DreuseForks=true",
]


@dataclass
class MutantPlan:
    tool: str
    mutant_id: str
    project: str
    files: list[str]
    apply_fn: Callable[[Path], None]
    file_hint: Optional[str] = None
    line: Optional[int] = None
    operator: Optional[str] = None
    intent: Optional[str] = None
    expected_behavior_change: Optional[str] = None
    patch_path: Optional[str] = None
    patch_descriptor: Optional[str] = None
    model: Optional[str] = None
    extra: dict = field(default_factory=dict)




DIFF_GIT_RE = re.compile(r"^diff --git a/(.+?) b/(.+)$", re.MULTILINE)
HUNK_HEADER_RE = re.compile(r"^@@ -(\d+)(?:,\d+)? \+(\d+)(?:,\d+)? @@", re.MULTILINE)


def files_in_patch(patch_text: str) -> list[str]:
    out: list[str] = []
    for m in DIFF_GIT_RE.finditer(patch_text):
        out.append(m.group(2).strip())

    return out


def first_hunk_line(patch_text: str) -> Optional[int]:
    m = HUNK_HEADER_RE.search(patch_text)

    return int(m.group(2)) if m else None


def apply_unified_patch(worktree: Path, patch_text: str) -> None:
    """Apply unified diff inside worktree. Try git apply, fall back to patch."""
    proc = subprocess.run(
        ["git", "apply", "--whitespace=nowarn", "-p1", "-"],
        input=patch_text, text=True, capture_output=True, cwd=worktree,
    )

    if proc.returncode != 0:
        proc = subprocess.run(
            ["patch", "-p1", "-l", "-N", "-r", "-", "--no-backup-if-mismatch"],
            input=patch_text, text=True, capture_output=True, cwd=worktree,
        )
        if proc.returncode != 0:
            raise RuntimeError(f"patch apply failed: {(proc.stderr or proc.stdout).strip()[:300]}")


def _normalize_ws(s: str) -> str:
    return re.sub(r"\s+", " ", s or "").strip()


def replace_method_in_source(source: str, original_method: str, new_method: str) -> Optional[str]:
    """Find original_method in source (exact, then ws-normalized) and splice in new_method."""
    if not original_method or not new_method:
        return None

    idx = source.find(original_method)
    if idx >= 0:
        return source[:idx] + new_method + source[idx + len(original_method):]

    # Whitespace-tolerant fallback: walk with normalized search.
    norm_src = _normalize_ws(source)
    norm_orig = _normalize_ws(original_method)
    if not norm_orig or norm_orig not in norm_src:
        return None

    # Locate by first/last token heuristic.
    toks = original_method.split()
    if not toks:
        return None
    
    first, last = toks[0], toks[-1]
    start = source.find(first)
    while start != -1:
        end_search = source.find(last, start)
        if end_search == -1:
            break
        candidate = source[start:end_search + len(last)]
        if _normalize_ws(candidate) == norm_orig:
            return source[:start] + new_method + source[end_search + len(last):]
        start = source.find(first, start + 1)

    return None




def load_sweagent_plans(project: str) -> list[MutantPlan]:
    patch_dir = REPO_ROOT / "mutants" / "sweagent" / project / "patch"
    if not patch_dir.is_dir():
        return []

    plans: list[MutantPlan] = []
    for patch_path in sorted(patch_dir.glob("M*.patch")):
        text = patch_path.read_text(encoding="utf-8", errors="ignore")
        files = files_in_patch(text)
        if not files:
            continue

        line_hint = first_hunk_line(text)
        mutant_id = patch_path.stem

        def _apply(worktree: Path, _t=text):
            apply_unified_patch(worktree, _t)

        plans.append(MutantPlan(
            tool="sweagent",
            mutant_id=mutant_id,
            project=project,
            files=files,
            apply_fn=_apply,
            file_hint=files[0],
            line=line_hint,
            patch_path=str(patch_path.relative_to(REPO_ROOT)).replace("\\", "/"),
            model="gpt-5-mini",
        ))

    return plans


def _strip_projects_prefix(p: str) -> str:
    norm = (p or "").replace("\\", "/")
    m = re.search(r"projects/[^/]+/(.*)$", norm)
    return m.group(1) if m else norm


def load_bugfarm_plans(project: str) -> list[MutantPlan]:
    src_path = REPO_ROOT / "mutants" / "data" / project / "unique_methods_codebert-base_selected_bugs.jsonl"
    if not src_path.exists():
        return []

    project_dir = PROJECT_DIRS[project]
    plans: list[MutantPlan] = []
    counter = 0

    with src_path.open("r", encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if not line:
                continue
            row = json.loads(line)

            rel = _strip_projects_prefix(row.get("file_path", ""))
            if not rel or not (project_dir / rel).exists():
                continue

            original_method = row.get("method", "")
            start_line = row.get("start_line")
            try:
                start_line_i = int(start_line) if start_line is not None else None
            except (TypeError, ValueError):
                start_line_i = None

            for k in (1, 2, 3):
                mutated = row.get(f"buggy_method{k}") or ""
                if not mutated.strip():
                    continue
                counter += 1
                mutant_id = f"M{counter:04d}"
                rel_local = rel  # closure capture
                orig_local = original_method
                mut_local = mutated

                def _apply(worktree: Path, _r=rel_local, _o=orig_local, _m=mut_local):
                    target = worktree / _r
                    src = target.read_text(encoding="latin-1")
                    new_src = replace_method_in_source(src, _o, _m)
                    if new_src is None:
                        raise RuntimeError(f"could not locate original method in {_r}")
                    target.write_text(new_src, encoding="latin-1")

                plans.append(MutantPlan(
                    tool="bugfarm",
                    mutant_id=mutant_id,
                    project=project,
                    files=[rel_local],
                    apply_fn=_apply,
                    file_hint=rel_local,
                    line=start_line_i,
                    operator="bugfarm_method_rewrite",
                    patch_descriptor=f"{Path(rel_local).name} :: bug{k}",
                    model="gpt-5",
                    extra={"row_index": row.get("index"), "variant": k},
                ))

    return plans


def load_leam_plans(project: str) -> list[MutantPlan]:
    src_path = REPO_ROOT / "mutants" / "results" / f"{project}_final_all.jsonl"
    if not src_path.exists():
        return []

    project_dir = PROJECT_DIRS[project]
    by_file: dict[str, list[dict]] = {}

    with src_path.open("r", encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if not line:
                continue
            obj = json.loads(line)
            by_file.setdefault(obj.get("filename", ""), []).append(obj)

    plans: list[MutantPlan] = []
    counter = 0

    for fname, entries in by_file.items():
        rel = _strip_projects_prefix(fname)
        if not rel or not (project_dir / rel).exists():
            continue

        mutated = [e for e in entries if int(e.get("target", -1)) == 0]
        original = [e for e in entries if int(e.get("target", -1)) == 1]

        for i, mut in enumerate(mutated):
            orig = original[i] if i < len(original) else (original[-1] if original else None)
            if orig is None:
                continue

            orig_body = orig.get("func", "")
            mut_body = mut.get("func", "")
            if not orig_body.strip() or not mut_body.strip():
                continue
            if _normalize_ws(orig_body) == _normalize_ws(mut_body):
                continue

            counter += 1
            mutant_id = f"M{counter:04d}"
            rel_local, orig_local, mut_local = rel, orig_body, mut_body

            def _apply(worktree: Path, _r=rel_local, _o=orig_local, _m=mut_local):
                target = worktree / _r
                src = target.read_text(encoding="latin-1")
                new_src = replace_method_in_source(src, _o, _m)
                if new_src is None:
                    raise RuntimeError(f"could not locate original method in {_r}")
                target.write_text(new_src, encoding="latin-1")

            plans.append(MutantPlan(
                tool="leam",
                mutant_id=mutant_id,
                project=project,
                files=[rel_local],
                apply_fn=_apply,
                file_hint=rel_local,
                operator="leam_method_rewrite",
                patch_descriptor=f"{Path(rel_local).name} :: leam",
                extra={"leam_idx": mut.get("idx")},
            ))

    return plans


LOADERS = {
    "sweagent": load_sweagent_plans,
    "bugfarm": load_bugfarm_plans,
    "leam": load_leam_plans,
}



def make_worker_copy(src: Path, dst: Path) -> None:
    if dst.exists():
        shutil.rmtree(dst)
    shutil.copytree(src, dst, symlinks=True)


def warmup_project(project_dir: Path) -> None:
    """Resolve deps + test-compile once so all workers can run mvn -o test."""
    print(f"[warmup] resolving deps in {project_dir}", flush=True)
    flags = [
        "-DskipTests=true",
        "-Drat.skip=true",
        "-Dcheckstyle.skip=true",
        "-Danimal.sniffer.skip=true",
        "-Denforcer.skip=true",
        "-Dpmd.skip=true",
        "-Dspotbugs.skip=true",
        "-Djacoco.skip=true",
    ]
    # resolve-plugins + resolve may fail on signature artifacts; proceed anyway.
    subprocess.run(
        ["mvn", "-q", *flags, "dependency:resolve-plugins", "dependency:resolve"],
        cwd=project_dir,
    )
    proc = subprocess.run(
        ["mvn", "-q", *flags, "test-compile"],
        cwd=project_dir, capture_output=True, text=True,
    )
    if proc.returncode != 0:
        raise RuntimeError(f"test-compile warmup failed:\n{(proc.stderr or proc.stdout)[-1000:]}")



def clear_surefire(worktree: Path) -> None:
    reports = worktree / "target" / "surefire-reports"
    if reports.exists():
        for f in reports.glob("TEST-*.xml"):
            try:
                f.unlink()
            except OSError:
                pass
        for f in reports.glob("*.txt"):
            try:
                f.unlink()
            except OSError:
                pass


def parse_surefire(worktree: Path) -> tuple[list[str], int, int]:
    """Return (failing_test_ids, total_tests, total_failures+errors)."""
    reports = worktree / "target" / "surefire-reports"
    failing: list[str] = []
    total = 0
    fails = 0
    if not reports.exists():
        return failing, total, fails

    for xml in reports.glob("TEST-*.xml"):
        try:
            tree = ET.parse(xml)
        except ET.ParseError:
            continue
        root = tree.getroot()
        try:
            total += int(root.get("tests") or 0)
            fails += int(root.get("failures") or 0) + int(root.get("errors") or 0)
        except (TypeError, ValueError):
            pass
        for tc in root.findall(".//testcase"):
            if tc.find("failure") is not None or tc.find("error") is not None:
                cls = tc.get("classname") or ""
                name = tc.get("name") or ""
                failing.append(f"{cls}.{name}".strip("."))

    return failing, total, fails


def run_mvn_test(worktree: Path, timeout: int) -> tuple[int, str, float]:
    cmd = ["mvn", *MAVEN_FLAGS, "test"]
    t0 = time.perf_counter()
    try:
        proc = subprocess.run(
            cmd, cwd=worktree, capture_output=True, text=True, timeout=timeout,
        )
        rc = proc.returncode
        out = (proc.stdout or "") + "\n" + (proc.stderr or "")

    except subprocess.TimeoutExpired as e:
        rc = -1
        out = (e.stdout or "") + "\n" + (e.stderr or "") if hasattr(e, "stdout") else ""
    elapsed = time.perf_counter() - t0
    return rc, out, elapsed




def execute_one(plan: MutantPlan, worktree: Path, originals: dict[str, str], timeout: int) -> MutantRecord:
    # 1. apply
    test_status = "unrun"
    compiles: Optional[bool] = None
    killing: list[str] = []
    test_time = 0.0
    error_msg: Optional[str] = None

    try:
        plan.apply_fn(worktree)
    except Exception as exc:
        error_msg = f"apply_failed: {exc}"
        test_status = "invalid"
        compiles = False

    # 2. clear & test
    if test_status != "invalid":
        clear_surefire(worktree)
        rc, out, test_time = run_mvn_test(worktree, timeout)
        failing, total, fails = parse_surefire(worktree)

        if rc == -1:
            test_status = "timeout"
            compiles = True
        elif total == 0 and fails == 0:
            # no tests ran → likely compile failure
            if "BUILD FAILURE" in out:
                # check if it was a compile error
                if "COMPILATION ERROR" in out or "compilation failure" in out.lower():
                    test_status = "invalid"
                    compiles = False
                    error_msg = "compile_error"
                else:
                    test_status = "invalid"
                    compiles = False
                    error_msg = "build_error"
            else:
                test_status = "survived"
                compiles = True
        else:
            compiles = True
            killing = failing
            test_status = "killed" if fails > 0 else "survived"

    # 3. restore (in-memory)
    for rel in plan.files:
        if rel in originals:
            target = worktree / rel
            try:
                target.write_text(originals[rel], encoding="latin-1")
            except OSError:
                pass

    extra = dict(plan.extra)
    if error_msg:
        extra["error"] = error_msg

    return MutantRecord(
        tool=plan.tool,
        mutant_id=plan.mutant_id,
        project=plan.project,
        patch=plan.patch_path,
        patch_descriptor=plan.patch_descriptor,
        file=plan.file_hint,
        line=plan.line,
        operator=plan.operator,
        intent=plan.intent,
        expected_behavior_change=plan.expected_behavior_change,
        compiles=compiles,
        test_status=test_status,
        killing_tests=killing,
        generation_time_s=0.0,
        generation_time_estimated=True,
        test_time_s=test_time,
        model=plan.model,
        extra=extra,
    )



def backfill_duplicates(records: list[MutantRecord]) -> None:
    """Compute semantic / near / behavioral duplicate pointers in place."""
    by_killing: dict[tuple, list[int]] = {}
    by_pos_op: dict[tuple, list[int]] = {}
    by_killing_cross: dict[tuple, list[int]] = {}

    for i, r in enumerate(records):
        kt = tuple(sorted(r.killing_tests))
        if r.test_status == "killed":
            by_killing.setdefault((r.tool, r.file, r.line, kt), []).append(i)
            by_killing_cross.setdefault(kt, []).append(i)
        if r.file is not None and r.line is not None and r.operator is not None:
            by_pos_op.setdefault((r.tool, r.file, r.line, r.operator), []).append(i)

    for buckets, attr in (
        (by_killing, "semantic_duplicate_of"),
        (by_pos_op, "near_duplicate_of"),
    ):
        for ids in buckets.values():
            if len(ids) < 2:
                continue
            anchor = records[ids[0]].mutant_id
            for j in ids[1:]:
                setattr(records[j], attr, anchor)

    for ids in by_killing_cross.values():
        if len(ids) < 2:
            continue
        # behavioral duplicates: same killing_tests across different tools
        tools_seen = {records[i].tool for i in ids}
        if len(tools_seen) < 2:
            continue
        anchor = records[ids[0]].mutant_id
        for j in ids[1:]:
            if records[j].tool != records[ids[0]].tool:
                records[j].behavioral_duplicate_of = anchor




def snapshot_originals(project_dir: Path, plans: list[MutantPlan]) -> dict[str, str]:
    """Read all files any mutant will modify, into a {rel_path: contents} dict."""
    files = {f for p in plans for f in p.files}
    out: dict[str, str] = {}
    for rel in files:
        path = project_dir / rel
        if path.exists():
            try:
                out[rel] = path.read_text(encoding="latin-1")
            except OSError:
                pass
    return out


def run_project(project: str, tools: list[str], n_workers: int, timeout: int, limit: Optional[int]) -> None:
    project_dir = PROJECT_DIRS[project]
    if not project_dir.exists():
        raise FileNotFoundError(f"project dir missing: {project_dir}")

    short = PROJECT_SHORT[project]

    # Gather plans.
    all_plans: list[MutantPlan] = []
    for tool in tools:
        loader = LOADERS[tool]
        plans = loader(project)
        if limit:
            plans = plans[:limit]
        all_plans.extend(plans)
        print(f"[load] {tool}/{project}: {len(plans)} mutants", flush=True)

    if not all_plans:
        print("nothing to run")
        return

    originals = snapshot_originals(project_dir, all_plans)

    # Warmup once on the canonical project dir.
    warmup_project(project_dir)

    # Set up N worker copies.
    work_root = Path(os.environ.get("HARNESS_WORK", "/tmp/harness_work"))
    work_root.mkdir(parents=True, exist_ok=True)

    print(f"[setup] cloning {n_workers} worker copies", flush=True)
    worker_paths: list[Path] = []
    for i in range(n_workers):
        wp = work_root / f"{project}-w{i}"
        make_worker_copy(project_dir, wp)
        worker_paths.append(wp)

    # Pre-fill queue.
    q: queue.Queue[Path] = queue.Queue()
    for wp in worker_paths:
        q.put(wp)

    # Open per-tool manifest sinks.
    out_root = REPO_ROOT / "mutants"
    sinks = {
        tool: out_root / f"{tool}_{short}_manifest.jsonl"
        for tool in tools
    }
    per_proj_manifests = {
        tool: out_root / tool / project / "manifest.jsonl"
        for tool in tools
    }
    for path in (*sinks.values(), *per_proj_manifests.values()):
        path.parent.mkdir(parents=True, exist_ok=True)
        if path.exists():
            path.unlink()

    write_lock = threading.Lock()
    counts = {tool: {"killed": 0, "survived": 0, "timeout": 0, "invalid": 0, "unrun": 0} for tool in tools}
    all_records: list[MutantRecord] = []
    t_start = time.perf_counter()

    def task(plan: MutantPlan) -> MutantRecord:
        wp = q.get()
        try:
            rec = execute_one(plan, wp, originals, timeout)
        finally:
            q.put(wp)
        return rec

    with ThreadPoolExecutor(max_workers=n_workers) as pool:
        futures = {pool.submit(task, p): p for p in all_plans}
        done = 0
        for fut in as_completed(futures):
            plan = futures[fut]
            done += 1
            try:
                rec = fut.result()
            except Exception as exc:
                sys.stderr.write(f"[{plan.tool}/{plan.mutant_id}] exception: {exc}\n")
                continue

            with write_lock:
                append_jsonl(rec, sinks[plan.tool])
                append_jsonl(rec, per_proj_manifests[plan.tool])
                counts[plan.tool][rec.test_status] = counts[plan.tool].get(rec.test_status, 0) + 1
                all_records.append(rec)

            if done % 5 == 0 or done == len(all_plans):
                elapsed = time.perf_counter() - t_start
                rate = done / elapsed if elapsed else 0
                eta = (len(all_plans) - done) / rate if rate else 0
                print(f"[{done}/{len(all_plans)}] {plan.tool}/{plan.mutant_id} -> {rec.test_status} "
                      f"({rec.test_time_s:.1f}s) | elapsed {elapsed:.0f}s eta {eta:.0f}s", flush=True)

    # Backfill duplicates and rewrite manifests with final values.
    backfill_duplicates(all_records)
    for path in (*sinks.values(), *per_proj_manifests.values()):
        if path.exists():
            path.unlink()
    for rec in all_records:
        append_jsonl(rec, sinks[rec.tool])
        append_jsonl(rec, per_proj_manifests[rec.tool])

    print("\n=== summary ===")
    for tool in tools:
        c = counts[tool]
        total = sum(c.values())
        print(f"  {tool}: {total} mutants  killed={c['killed']} survived={c['survived']} "
              f"timeout={c['timeout']} invalid={c['invalid']}")
    print(f"wall-clock: {time.perf_counter() - t_start:.0f}s")


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--project", required=True, choices=sorted(PROJECT_DIRS))
    ap.add_argument("--tools", default="sweagent,bugfarm,leam")
    ap.add_argument("--workers", type=int, default=DEFAULT_WORKERS)
    ap.add_argument("--timeout", type=int, default=DEFAULT_TIMEOUT)
    ap.add_argument("--limit", type=int, default=0,
                    help="cap mutants per tool (debug)")
    args = ap.parse_args()

    tools = [t.strip() for t in args.tools.split(",") if t.strip()]
    bad = [t for t in tools if t not in LOADERS]
    if bad:
        print(f"unknown tools: {bad}", file=sys.stderr)
        return 2

    run_project(args.project, tools, args.workers, args.timeout, args.limit or None)
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
