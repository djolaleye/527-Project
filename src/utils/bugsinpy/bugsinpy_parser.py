import logging
import subprocess
from pathlib import Path

from unidiff import PatchSet

from .models import BugEntry, BugInfo, PatchInfo

logger = logging.getLogger(__name__)


def clone_or_update_bugsinpy(repo_url: str, target_dir: Path) -> Path:
    """Clone BugsInPy repo if not present, or pull if it exists."""
    if target_dir.exists() and (target_dir / ".git").exists():
        logger.info("BugsInPy repo already exists at %s, pulling latest...", target_dir)
        subprocess.run(["git", "pull"], cwd=target_dir, check=True, capture_output=True)
    else:
        logger.info("Cloning BugsInPy to %s...", target_dir)
        subprocess.run(
            ["git", "clone", repo_url, str(target_dir)],
            check=True,
            capture_output=True,
        )
    return target_dir


def list_all_bugs(bugsinpy_dir: Path) -> list[BugEntry]:
    """Enumerate all bugs across all projects."""
    bugs = []
    projects_dir = bugsinpy_dir / "projects"
    if not projects_dir.exists():
        logger.error("Projects directory not found: %s", projects_dir)
        return bugs

    for project_dir in sorted(projects_dir.iterdir()):
        if not project_dir.is_dir():
            continue
        bugs_dir = project_dir / "bugs"
        if not bugs_dir.exists():
            continue
        for bug_dir in sorted(bugs_dir.iterdir()):
            if not bug_dir.is_dir():
                continue
            try:
                bug_id = int(bug_dir.name)
            except ValueError:
                continue
            bugs.append(BugEntry(
                project=project_dir.name,
                bug_id=bug_id,
                path=str(bug_dir),
            ))
    return bugs


def parse_bug_info(bug_dir: Path) -> BugInfo | None:
    """Parse bug.info file for commit hashes and test info."""
    info_file = bug_dir / "bug.info"
    if not info_file.exists():
        # Try alternate name
        info_file = bug_dir / "bug_patch.info"
    if not info_file.exists():
        logger.warning("No bug info file found in %s", bug_dir)
        return None

    data = {}
    for line in info_file.read_text(encoding="utf-8", errors="replace").splitlines():
        line = line.strip()
        if "=" in line:
            key, _, value = line.partition("=")
            data[key.strip().strip('"')] = value.strip().strip('"')

    try:
        return BugInfo(
            python_version=data.get("python_version", ""),
            buggy_commit_id=data.get("buggy_commit_id", ""),
            fixed_commit_id=data.get("fixed_commit_id", ""),
            test_file=data.get("test_file", ""),
        )
    except Exception as e:
        logger.warning("Failed to parse bug info in %s: %s", bug_dir, e)
        return None


def parse_patch(bug_dir: Path) -> PatchInfo | None:
    """Parse bug_patch.txt to extract changed files and line numbers."""
    patch_file = bug_dir / "bug_patch.txt"
    if not patch_file.exists():
        logger.warning("No patch file found in %s", bug_dir)
        return None

    try:
        patch_text = patch_file.read_text(encoding="utf-8", errors="replace")
        patch_set = PatchSet(patch_text)
    except Exception as e:
        logger.warning("Failed to parse patch in %s: %s", bug_dir, e)
        return None

    files = []
    lines_added = 0
    lines_removed = 0
    changed_line_numbers: dict[str, list[int]] = {}

    for patched_file in patch_set:
        file_path = patched_file.target_file
        # Remove b/ prefix from git diff
        if file_path.startswith("b/"):
            file_path = file_path[2:]
        files.append(file_path)
        lines_added += patched_file.added
        lines_removed += patched_file.removed

        changed_lines = []
        for hunk in patched_file:
            for line in hunk:
                if line.is_added and line.target_line_no is not None:
                    changed_lines.append(line.target_line_no)
                elif line.is_removed and line.source_line_no is not None:
                    changed_lines.append(line.source_line_no)
        changed_line_numbers[file_path] = changed_lines

    return PatchInfo(
        num_files_changed=len(files),
        files=files,
        lines_added=lines_added,
        lines_removed=lines_removed,
        total_lines_changed=lines_added + lines_removed,
        changed_line_numbers=changed_line_numbers,
    )


def get_project_github_url(bugsinpy_dir: Path, project_name: str) -> str | None:
    """Read project.info to get the upstream GitHub URL."""
    info_file = bugsinpy_dir / "projects" / project_name / "project.info"
    if not info_file.exists():
        return None

    for line in info_file.read_text(encoding="utf-8", errors="replace").splitlines():
        line = line.strip()
        if "github_url" in line and "=" in line:
            _, _, url = line.partition("=")
            return url.strip().strip('"')
    return None
