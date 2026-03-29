#!/usr/bin/env python3
"""Filter BugsInPy dataset to create a subset suitable for mutation testing.

Inspired by the PANTA paper (Gu et al., 2025), which selects non-abstract,
public classes with at least one non-private method exceeding a cyclomatic
complexity threshold from Defects4J. This script applies analogous filtering
criteria to BugsInPy for Python-based mutation testing experiments.
"""

import argparse
import json
import logging
import shutil
import sys
from pathlib import Path

import pandas as pd
from tqdm import tqdm

from .ast_analyzer import class_passes_filters, find_changed_classes
from .bugsinpy_parser import (
    clone_or_update_bugsinpy,
    get_project_github_url,
    list_all_bugs,
    parse_bug_info,
    parse_patch,
)
from .complexity_checker import (
    compute_class_complexity,
    compute_file_metrics,
    passes_complexity_filter,
)
from .config import (
    BUGSINPY_LOCAL_PATH,
    BUGSINPY_REPO_URL,
    MAX_PATCH_LINES,
    OUTPUT_DIR,
    SUBSET_DIR,
)
from .models import FilteredBug
from .source_fetcher import fetch_file_from_github

logger = logging.getLogger(__name__)


def setup_logging(verbose: bool):
    level = logging.DEBUG if verbose else logging.INFO
    logging.basicConfig(
        level=level,
        format="%(asctime)s [%(levelname)s] %(name)s: %(message)s",
        handlers=[logging.StreamHandler(sys.stdout)],
    )


def filter_bugs(bugsinpy_dir: Path, verbose: bool = False) -> tuple[list[FilteredBug], dict]:
    """Run the two-tier filtering pipeline on all BugsInPy bugs."""
    all_bugs = list_all_bugs(bugsinpy_dir)
    logger.info("Found %d total bugs across all projects", len(all_bugs))

    # Cache project GitHub URLs
    project_urls: dict[str, str | None] = {}

    results: list[FilteredBug] = []
    stats = {
        "total": len(all_bugs),
        "rejected_no_patch": 0,
        "rejected_multi_file": 0,
        "rejected_not_python": 0,
        "rejected_patch_too_large": 0,
        "rejected_no_bug_info": 0,
        "rejected_no_github_url": 0,
        "rejected_fetch_failed": 0,
        "rejected_no_qualifying_class": 0,
        "rejected_complexity": 0,
        "passed": 0,
    }

    for bug in tqdm(all_bugs, desc="Filtering bugs", disable=verbose):
        bug_dir = Path(bug.path)
        label = f"{bug.project}/bug_{bug.bug_id}"

        # --- Tier 1: Patch-based filtering ---

        patch = parse_patch(bug_dir)
        if patch is None:
            stats["rejected_no_patch"] += 1
            logger.debug("%s: no patch file", label)
            continue

        # Single .py file only
        py_files = [f for f in patch.files if f.endswith(".py")]
        if len(py_files) != 1 or len(patch.files) != 1:
            stats["rejected_multi_file"] += 1
            logger.debug("%s: %d files changed (need exactly 1 .py)", label, len(patch.files))
            continue

        if not py_files:
            stats["rejected_not_python"] += 1
            logger.debug("%s: no Python files in patch", label)
            continue

        if patch.total_lines_changed > MAX_PATCH_LINES:
            stats["rejected_patch_too_large"] += 1
            logger.debug("%s: patch too large (%d lines)", label, patch.total_lines_changed)
            continue

        # --- Tier 2: AST + complexity analysis ---

        bug_info = parse_bug_info(bug_dir)
        if bug_info is None or not bug_info.fixed_commit_id:
            stats["rejected_no_bug_info"] += 1
            logger.debug("%s: no bug info or missing commit hash", label)
            continue

        # Get project GitHub URL (cached)
        if bug.project not in project_urls:
            project_urls[bug.project] = get_project_github_url(bugsinpy_dir, bug.project)
        github_url = project_urls[bug.project]
        if not github_url:
            stats["rejected_no_github_url"] += 1
            logger.debug("%s: no GitHub URL for project", label)
            continue

        # Fetch source file at fixed commit
        target_file = py_files[0]
        source = fetch_file_from_github(github_url, bug_info.fixed_commit_id, target_file)
        if source is None:
            stats["rejected_fetch_failed"] += 1
            logger.debug("%s: failed to fetch source", label)
            continue

        # AST analysis: find classes touched by patch
        changed_lines = patch.changed_line_numbers.get(target_file, [])
        changed_classes = find_changed_classes(source, changed_lines)
        qualifying_classes = [c for c in changed_classes if class_passes_filters(c)]

        if not qualifying_classes:
            stats["rejected_no_qualifying_class"] += 1
            logger.debug("%s: no qualifying classes found", label)
            continue

        # Complexity analysis
        file_metrics = compute_file_metrics(source)

        all_pass = True
        for cls in qualifying_classes:
            complexity = compute_class_complexity(source, cls.name)
            if not passes_complexity_filter(complexity, file_metrics):
                all_pass = False
                logger.debug("%s: class %s failed complexity filter", label, cls.name)
                break

        if not all_pass:
            stats["rejected_complexity"] += 1
            continue

        # Bug passes all filters
        for cls in qualifying_classes:
            complexity = compute_class_complexity(source, cls.name)
            non_private = [m for m in cls.methods if m.is_public]
            results.append(FilteredBug(
                project=bug.project,
                bug_id=bug.bug_id,
                file_path=target_file,
                class_name=cls.name,
                num_public_methods=len(non_private),
                max_complexity=complexity.max_cc if complexity else 0,
                avg_complexity=complexity.average_cc if complexity else 0.0,
                patch_lines=patch.total_lines_changed,
                python_version=bug_info.python_version,
                test_file=bug_info.test_file,
                buggy_commit=bug_info.buggy_commit_id,
                fixed_commit=bug_info.fixed_commit_id,
            ))

        stats["passed"] += 1

    return results, stats


def copy_subset(results: list[FilteredBug], bugsinpy_dir: Path, subset_dir: Path):
    """Copy matching bug artifacts from BugsInPy clone into bugsinpy-subset/.

    For each passing bug, copies:
      - projects/<project>/project.info
      - projects/<project>/bugs/<bug_id>/  (entire bug directory)

    This produces a self-contained subset that can be used with BugsInPy
    tooling (bugsinpy-checkout, bugsinpy-run) for mutation testing evaluation.
    """
    subset_dir.mkdir(parents=True, exist_ok=True)

    # Deduplicate by (project, bug_id) since a bug can produce multiple
    # FilteredBug entries (one per qualifying class)
    seen: set[tuple[str, int]] = set()
    copied_projects: set[str] = set()

    for bug in results:
        key = (bug.project, bug.bug_id)
        if key in seen:
            continue
        seen.add(key)

        # Copy project.info (once per project)
        if bug.project not in copied_projects:
            src_project_dir = bugsinpy_dir / "projects" / bug.project
            dst_project_dir = subset_dir / "projects" / bug.project
            dst_project_dir.mkdir(parents=True, exist_ok=True)

            # Copy project-level files
            for fname in ["project.info"]:
                src_file = src_project_dir / fname
                if src_file.exists():
                    shutil.copy2(src_file, dst_project_dir / fname)

            # Create bugs/ directory
            (dst_project_dir / "bugs").mkdir(exist_ok=True)
            copied_projects.add(bug.project)

        # Copy the entire bug directory
        src_bug_dir = bugsinpy_dir / "projects" / bug.project / "bugs" / str(bug.bug_id)
        dst_bug_dir = subset_dir / "projects" / bug.project / "bugs" / str(bug.bug_id)

        if src_bug_dir.exists():
            if dst_bug_dir.exists():
                shutil.rmtree(dst_bug_dir)
            shutil.copytree(src_bug_dir, dst_bug_dir)
            logger.info("Copied %s/bug_%d", bug.project, bug.bug_id)
        else:
            logger.warning("Bug directory not found: %s", src_bug_dir)

    logger.info("Copied %d bugs across %d projects into %s",
                len(seen), len(copied_projects), subset_dir)


def write_results(results: list[FilteredBug], output_dir: Path):
    """Write results to CSV and JSON."""
    output_dir.mkdir(parents=True, exist_ok=True)

    # CSV
    csv_path = output_dir / "bugsinpy_filtered.csv"
    if results:
        df = pd.DataFrame([r.model_dump() for r in results])
    else:
        df = pd.DataFrame()
    df.to_csv(csv_path, index=False)
    logger.info("Wrote %d entries to %s", len(results), csv_path)

    # JSON
    json_path = output_dir / "bugsinpy_filtered.json"
    with open(json_path, "w", encoding="utf-8") as f:
        json.dump([r.model_dump() for r in results], f, indent=2)
    logger.info("Wrote %d entries to %s", len(results), json_path)


def load_filtered_results(path: Path) -> list[FilteredBug]:
    with open(path) as f:
        data = json.load(f)
    return [FilteredBug(**r) for r in data]


def main():
    parser = argparse.ArgumentParser(description="Filter BugsInPy for mutation testing")
    parser.add_argument(
        "--bugsinpy-dir", type=Path, default=BUGSINPY_LOCAL_PATH,
        help="Path to BugsInPy clone (default: %(default)s)",
    )
    parser.add_argument(
        "--output-dir", type=Path, default=OUTPUT_DIR,
        help="Output directory for CSV/JSON results (default: %(default)s)",
    )
    parser.add_argument(
        "--subset-dir", type=Path, default=SUBSET_DIR,
        help="Directory to copy filtered bug artifacts into (default: %(default)s)",
    )
    parser.add_argument(
        "--verbose", "-v", action="store_true",
        help="Enable verbose logging",
    )
    parser.add_argument(
        "--skip-clone", action="store_true",
        help="Skip cloning/updating BugsInPy repo",
    )
    parser.add_argument(
        "--skip-copy", action="store_true",
        help="Skip copying bug artifacts into subset directory",
    )
    args = parser.parse_args()

    setup_logging(args.verbose)

    # Clone or update BugsInPy
    if not args.skip_clone:
        clone_or_update_bugsinpy(BUGSINPY_REPO_URL, args.bugsinpy_dir)

    # Run filtering pipeline
    results, stats = filter_bugs(args.bugsinpy_dir, verbose=args.verbose)

    # Write CSV/JSON results
    write_results(results, args.output_dir)

    # Copy bug artifacts into subset directory
    if not args.skip_copy and results:
        copy_subset(results, args.bugsinpy_dir, args.subset_dir)

    # Print summary
    print("\n=== Filtering Summary ===")
    for key, value in stats.items():
        print(f"  {key}: {value}")
    print(f"\n  Final subset: {len(results)} entries from {stats['passed']} bugs")
    if not args.skip_copy and results:
        print(f"  Bug artifacts copied to: {args.subset_dir}")


if __name__ == "__main__":
    main()
