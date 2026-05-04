from __future__ import annotations

import argparse
import json
import os
import random
import re
import shutil
import subprocess
import sys
import tempfile
import time
from pathlib import Path
from typing import Optional

from .schema import MutantRecord, append_jsonl

"""
Drive mini-swe-agent to produce one mutant per run on a Defects4J subset project.

Usage:
    python -m src.evaluation.sweagent_driver --project commons-cli --n 20 --seed 0 --model gpt-5

Each run:
  1. Picks a (file, method) target from mutants/results/<project>_final_all.jsonl.
  2. Copies the project to a temp worktree.
  3. Invokes the mini-swe-agent CLI with the mutation prompt.
  4. Captures the resulting `git diff` as mutants/sweagent/<project>/M###.patch.
  5. Parses the agent's JSON note from the trajectory and writes an entry.
"""

REPO_ROOT = Path(__file__).resolve().parents[2]
LEAM_RESULTS = REPO_ROOT / "mutants" / "results"

PROJECT_DIRS = {
    "commons-cli": REPO_ROOT / "defects4j-subset" / "Cli-40f",
    "commons-csv": REPO_ROOT / "defects4j-subset" / "Csv-16f",
}

DEFAULT_OUT_ROOT = REPO_ROOT / "mutants" / "sweagent"
DEFAULT_TRAJ_ROOT = REPO_ROOT / "trajectories"

PROMPT_TEMPLATE = """
Create exactly one realistic fault in the target project.

Target file: {file}
Target method (lines {start}-{end}): {method_name}

Rules:
- Do not edit tests, build files, or configs.
- Keep the project compiling.
- The change should be small and bug-like, not arbitrary.
- Make exactly one edit, in the file above, inside the method indicated.
- Output a short JSON note as the final message:
  {{"file": "...", "intent": "...", "expected_behavior_change": "..."}}
"""

# Regex to standardize JSON output
JSON_NOTE_RE = re.compile(
    r"\{\s*\"file\"\s*:\s*\".*?\"\s*,\s*\"intent\"\s*:\s*\".*?\"\s*,\s*\"expected_behavior_change\"\s*:\s*\".*?\"\s*\}",
    re.DOTALL,
)


def load_targets(project: str) -> list[dict]:
    """Load (file, method) candidates from LEAM's per-method jsonl."""
    path = LEAM_RESULTS / f"{project}_final_all.jsonl"
    if not path.exists():
        raise FileNotFoundError(f"No LEAM target list at {path}")

    out: list[dict] = []

    with path.open("r", encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if not line:
                continue

            obj = json.loads(line)
            out.append(obj)

    return out


def pick_target(project: str, seed: int) -> dict:
    rng = random.Random(seed)
    candidates = load_targets(project)
    if not candidates:
        raise RuntimeError(f"No candidates for {project}")
    return rng.choice(candidates)


def _method_header(func_text: str) -> tuple[str, int, int]:
    """Best-effort method name + line range from a func blob."""
    name_match = re.search(r"\b([A-Za-z_][A-Za-z0-9_]*)\s*\(", func_text or "")
    name = name_match.group(1) if name_match else "<unknown>"
    return name, 0, 0


def make_worktree(project_dir: Path) -> Path:
    tmp = Path(tempfile.mkdtemp(prefix="sweagent_mutant_"))
    dst = tmp / project_dir.name
    shutil.copytree(project_dir, dst, symlinks=True)

    if not (dst / ".git").exists():
        subprocess.run(["git", "init", "-q"], cwd=dst, check=True)
        subprocess.run(["git", "add", "-A"], cwd=dst, check=True)
        subprocess.run(
            ["git", "-c", "user.email=h@x", "-c", "user.name=h", "commit", "-q", "-m", "base"],
            cwd=dst, check=True,
        )

    return dst


def run_mini(worktree: Path, prompt: str, model: str, traj_path: Path, extra_args: list[str]) -> tuple[int, str, str]:
    """Invoke `mini` CLI in non-interactive mode."""
    traj_path.parent.mkdir(parents=True, exist_ok=True)

    cmd = [
        "mini",
        "-y",
        "-t", prompt,
        "-m", model,
        "-o", str(traj_path),
        *extra_args,
    ]

    proc = subprocess.run(
        cmd, cwd=worktree, input="\n", text=True,
        env={**os.environ},
    )

    return proc.returncode, proc.stdout, proc.stderr


def extract_diff(worktree: Path) -> str:
    proc = subprocess.run(
        ["git", "diff", "--no-color"], cwd=worktree,
        capture_output=True, text=True, check=True,
    )

    return proc.stdout


def extract_json_note(traj_path: Path, stdout: str) -> Optional[dict]:
    """Find {file, intent, expected_behavior_change} blob anywhere in the run."""
    blobs: list[str] = []

    if traj_path.exists():
        blobs.append(traj_path.read_text(encoding="utf-8", errors="ignore"))

    blobs.append(stdout or "")

    for blob in blobs:
        for m in JSON_NOTE_RE.finditer(blob):
            try:
                return json.loads(m.group(0))
            except json.JSONDecodeError:
                continue

    return None


def parse_trajectory_tokens(traj_path: Path) -> tuple[Optional[int], Optional[int]]:
    if not traj_path.exists():
        return None, None
    
    try:
        data = json.loads(traj_path.read_text(encoding="utf-8"))
    except (json.JSONDecodeError, UnicodeDecodeError):
        return None, None

    info = data.get("info") or data.get("usage") or {}

    return info.get("input_tokens") or info.get("prompt_tokens"), \
           info.get("output_tokens") or info.get("completion_tokens")


def run_one(proj: str, seed: int, mutant_idx: int, model_name: str, out_root: Path, traj_root: Path, extra_args: list[str]) -> Optional[MutantRecord]:
    project_dir = PROJECT_DIRS[proj]
    target = pick_target(proj, seed)

    file_rel = target.get("filename") or target.get("file_path") or "<unknown>"
    method_name, _, _ = _method_header(target.get("func", ""))

    start = int(target.get("start_line") or 0)
    end = int(target.get("end_line") or 0)

    prompt = PROMPT_TEMPLATE.format(file=file_rel, method_name=method_name, start=start, end=end,)

    mutant_id = f"M{mutant_idx:04d}"
    out_dir = out_root / proj
    out_dir.mkdir(parents=True, exist_ok=True)

    patch_path = out_dir / f"{mutant_id}.patch"
    traj_path = traj_root / proj / f"{mutant_id}.traj.json"

    worktree = make_worktree(project_dir)
    t0 = time.perf_counter()

    rc, stdout, stderr = run_mini(worktree, prompt, model_name, traj_path, extra_args)
    gen_time = time.perf_counter() - t0

    diff = extract_diff(worktree)

    note = extract_json_note(traj_path, stdout) or {}
    tokens_input, tokens_output = parse_trajectory_tokens(traj_path)

    if not diff.strip():
        sys.stderr.write(f"[{mutant_id}] empty diff (rc={rc}); skipping\n")
        if stderr:
            sys.stderr.write(stderr[-500:] + "\n")

        shutil.rmtree(worktree.parent, ignore_errors=True)
        return None

    patch_path.write_text(diff, encoding="utf-8")

    rec = MutantRecord(
        tool="sweagent",
        mutant_id=mutant_id,
        project=proj,
        patch=str(patch_path.relative_to(REPO_ROOT)),
        file=note.get("file") or file_rel,
        intent=note.get("intent"),
        expected_behavior_change=note.get("expected_behavior_change"),
        generation_time_s=gen_time,
        model=model_name,
        tokens_in=tokens_input,
        tokens_out=tokens_output,
        trajectory=str(traj_path.relative_to(REPO_ROOT)) if traj_path.exists() else None,
        extra={"seed": seed, "agent_rc": rc},
    )

    shutil.rmtree(worktree.parent, ignore_errors=True)
    return rec


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--project", required=True, choices=sorted(PROJECT_DIRS))
    ap.add_argument("--n", type=int, default=10)
    ap.add_argument("--seed", type=int, default=0)
    ap.add_argument("--model", default="openai/gpt-5-mini")
    ap.add_argument("--out", type=Path, default=DEFAULT_OUT_ROOT)
    ap.add_argument("--traj", type=Path, default=DEFAULT_TRAJ_ROOT)
    ap.add_argument("--start-id", type=int, default=1)
    ap.add_argument("--mini-arg", action="append", default=[], help="Pass-through arg to the `mini` CLI (repeatable).")
    args = ap.parse_args()

    manifest = args.out / args.project / "manifest.jsonl"
    rng = random.Random(args.seed)

    written = 0
    for i in range(args.n):
        idx = args.start_id + i
        run_seed = rng.randint(0, 2**31 - 1)

        try:
            rec = run_one(args.project, run_seed, idx, args.model,
                          args.out, args.traj, args.mini_arg)
        except Exception as exc:
            sys.stderr.write(f"[M{idx:04d}] error: {exc}\n")
            continue

        if rec is None:
            continue

        append_jsonl(rec, manifest)
        written += 1
        print(f"[M{idx:04d}] {rec.file} ({rec.generation_time_s:.1f}s)")

    print(f"wrote {written}/{args.n} mutants → {manifest}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
