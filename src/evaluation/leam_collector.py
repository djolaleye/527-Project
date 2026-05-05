from __future__ import annotations

import argparse
import difflib
import json
import re
from pathlib import Path
from typing import Optional

from .schema import MutantRecord, append_jsonl

"""
LEAM mutants to MutantRecord schema.

LEAM entries:
  - target == 1 : original method body
  - target == 0 : mutant method body

Usage:
    python -m src.evaluation.leam_collector --project commons-cli
"""

REPO_ROOT = Path(__file__).resolve().parents[2]
LEAM_RESULTS = REPO_ROOT / "mutants" / "results"

PROJECT_DIRS = {
    "commons-cli": REPO_ROOT / "defects4j-subset" / "Cli-40f",
    "commons-csv": REPO_ROOT / "defects4j-subset" / "Csv-16f",
}

DEFAULT_OUT_ROOT = REPO_ROOT / "mutants" / "leam"


def remap_filename(remote_path: str, project: str) -> Optional[Path]:
    """LEAM stores /app/projects/<proj>/... —> remap to local repo path."""
    if not remote_path:
        return None

    norm = remote_path.replace("\\", "/")
    marker = f"/projects/{project}/"

    if marker in norm:
        rel = norm.split(marker, 1)[1]
    else:
        m = re.search(r"/projects/[^/]+/(.*)$", norm)
        if not m:
            return None
        rel = m.group(1)

    local = PROJECT_DIRS[project] / rel
    return local if local.exists() else None


def load_pairs(jsonl_path: Path) -> list[tuple[dict, dict]]:
    """Group consecutive (target=0 mutated, target=1 original) entries per filename."""
    by_file: dict[str, list[dict]] = {}

    with jsonl_path.open("r", encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if not line:
                continue

            obj = json.loads(line)
            by_file.setdefault(obj.get("filename", ""), []).append(obj)

    pairs: list[tuple[dict, dict]] = []

    for fname, entries in by_file.items():
        mutated = [e for e in entries if int(e.get("target", -1)) == 0]
        original = [e for e in entries if int(e.get("target", -1)) == 1]

        for i, mut in enumerate(mutated):
            if i < len(original):
                orig = original[i]
            elif original:
                orig = original[-1]
            else:
                continue

            pairs.append((mut, orig))

    return pairs


def _normalize(s: str) -> str:
    return re.sub(r"\s+", " ", s or "").strip()


def find_method_span(source: str, original_method: str) -> Optional[tuple[int, int]]:
    """Find the original method's character span in the source file.

    We try an exact match first, then a whitespace-normalized fallback.
    Returns (start, end) char offsets, or None if not found.
    """
    if not original_method:
        return None

    idx = source.find(original_method)
    if idx >= 0:
        return idx, idx + len(original_method)

    norm_original = _normalize(original_method)
    norm_source = _normalize(source)
    n_idx = norm_source.find(norm_original)
    if n_idx < 0:
        return None

    target_words = original_method.split()
    if not target_words:
        return None

    first = target_words[0]
    last = target_words[-1]

    start = source.find(first)
    while start != -1:
        end_search = source.rfind(last, start, start + len(original_method) * 2)
        
        if end_search != -1:
            return start, end_search + len(last)
        
        start = source.find(first, start + 1)

    return None


def make_unified_diff(rel_path: str, original_text: str, mutated_text: str) -> str:
    diff = difflib.unified_diff(
        original_text.splitlines(keepends=True),
        mutated_text.splitlines(keepends=True),
        fromfile=f"a/{rel_path}",
        tofile=f"b/{rel_path}",
        n=3,
    )
    return "".join(diff)


def collect(proj: str, out_root: Path, total_gen_time: float) -> int:
    pairs_path = LEAM_RESULTS / f"{proj}_final_all.jsonl"
    if not pairs_path.exists():
        raise FileNotFoundError(f"Missing LEAM jsonl: {pairs_path}")

    pairs = load_pairs(pairs_path)
    if not pairs:
        print(f"no LEAM pairs found in {pairs_path}")
        return 0

    out_dir = out_root / proj
    out_dir.mkdir(parents=True, exist_ok=True)
    manifest = out_dir / "manifest.jsonl"

    if manifest.exists():
        manifest.unlink()

    project_dir = PROJECT_DIRS[proj]
    per_mutant_gen = (total_gen_time / len(pairs)) if total_gen_time > 0 else 0.0

    written = 0
    skipped_missing_file = 0
    skipped_missing_method = 0

    for i, (mut, orig) in enumerate(pairs, start=1):
        local_file = remap_filename(orig.get("filename", ""), proj)
        if local_file is None:
            skipped_missing_file += 1
            continue

        try:
            source = local_file.read_text(encoding="utf-8")
        except OSError:
            skipped_missing_file += 1
            continue

        original_method = orig.get("func", "")
        mutated_method = mut.get("func", "")

        span = find_method_span(source, original_method)
        if span is None:
            skipped_missing_method += 1
            continue

        start, end = span
        new_source = source[:start] + mutated_method + source[end:]
        if new_source == source:
            continue

        try:
            rel_path = str(local_file.relative_to(REPO_ROOT)).replace("\\", "/")
        except ValueError:
            rel_path = local_file.name

        diff = make_unified_diff(rel_path, source, new_source)
        if not diff.strip():
            continue

        mutant_id = f"M{i:04d}"
        patch_path = out_dir / f"{mutant_id}.patch"
        patch_path.write_text(diff, encoding="utf-8")

        line_no = source[:start].count("\n") + 1

        rec = MutantRecord(
            tool="leam",
            mutant_id=mutant_id,
            project=proj,
            patch=str(patch_path.relative_to(REPO_ROOT)).replace("\\", "/"),
            file=rel_path,
            line=line_no,
            operator="leam_method_rewrite",
            generation_time_s=per_mutant_gen,
            generation_time_estimated=True,
            extra={
                "leam_idx": mut.get("idx"),
                "leam_filename_remote": orig.get("filename"),
            },
        )
        append_jsonl(rec, manifest)
        written += 1

    print(
        f"LEAM: wrote {written}/{len(pairs)} mutants "
        f"(skipped {skipped_missing_file} missing files, "
        f"{skipped_missing_method} unfound methods) → {manifest}"
    )
    return written


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--project", required=True, choices=sorted(PROJECT_DIRS))
    ap.add_argument("--out", type=Path, default=DEFAULT_OUT_ROOT)
    ap.add_argument(
        "--total-gen-time",
        type=float,
        default=0.0,
        help="Wall-clock seconds of the LEAM run; amortized per mutant.",
    )
    args = ap.parse_args()

    collect(args.project, args.out, args.total_gen_time)
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
