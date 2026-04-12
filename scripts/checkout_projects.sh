#!/usr/bin/env bash
# Usage: bash scripts/checkout_projects.sh [--root <dir>]
#   --root  Root of the 527-Project repo (default: directory containing this script's parent)

set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
REPO_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"

while [[ $# -gt 0 ]]; do
  case "$1" in
    --root) REPO_ROOT="$2"; shift 2 ;;
    *) echo "Unknown argument: $1"; exit 1 ;;
  esac
done

PROJECTS_DIR="$REPO_ROOT/projects"
D4J_SUBSET="$REPO_ROOT/defects4j-subset"
BSPY_SUBSET="$REPO_ROOT/bugsinpy-subset/projects"

mkdir -p "$PROJECTS_DIR"


log()  { echo "[checkout] $*"; }
skip() { echo "[skip]     $*"; }
err()  { echo "[error]    $*" >&2; }

# ── Defects4J name → canonical directory name mapping ────────────────────────
# defects4j project IDs differ from the well-known artifact names used
# downstream (e.g. commons-cli, joda-time).  This associative array provides
# the mapping; keys are the defects4j project identifiers (case-sensitive).
declare -A D4J_NAMES=(
  ["Cli"]="commons-cli"
  ["Codec"]="commons-codec"
  ["Collections"]="commons-collections"
  ["Compress"]="commons-compress"
  ["Csv"]="commons-csv"
  ["Gson"]="gson"
  ["JacksonCore"]="jackson-core"
  ["JacksonDatabind"]="jackson-databind"
  ["JacksonXml"]="jackson-dataformat-xml"
  ["Jsoup"]="jsoup"
  ["JxPath"]="commons-jxpath"
  ["Lang"]="commons-lang"
  ["Math"]="commons-math"
  ["Time"]="joda-time"
)

# ── Defects4J checkouts ───────────────────────────────────────────────────────
# Each entry in defects4j-subset/ is named <Project>-<BugId>f (e.g. Cli-40f).
# We parse the project name and bug ID from the directory name, then run:
#   defects4j checkout -p <Project> -v <BugId>f -w projects/<canonical-name>

log "=== Defects4J (Java) ==="

if ! command -v defects4j &>/dev/null; then
  err "'defects4j' not found on PATH – skipping Java checkouts."
else
  for entry in "$D4J_SUBSET"/*/; do
    dir_name="$(basename "$entry")"

    # Parse: strip trailing 'f', split on last '-'
    without_f="${dir_name%f}"                   # e.g. Cli-40
    d4j_project="${without_f%-*}"               # e.g. Cli
    bug_id="${without_f##*-}"                   # e.g. 40
    version="${bug_id}f"                        # e.g. 40f

    canonical="${D4J_NAMES[$d4j_project]-}"
    if [[ -z "$canonical" ]]; then
      err "No canonical name for Defects4J project '$d4j_project' – skipping $dir_name"
      continue
    fi

    target="$PROJECTS_DIR/$canonical"

    if [[ -d "$target" ]]; then
      skip "$canonical already exists at $target"
      continue
    fi

    log "Checking out $d4j_project bug $bug_id (fixed) → $target"
    defects4j checkout -p "$d4j_project" -v "$version" -w "$target"
  done
fi

# ── BugsInPy checkouts ────────────────────────────────────────────────────────
# Each project in bugsinpy-subset/projects/ may have multiple bug IDs under
# bugs/.  Every (project, bug_id) pair is checked out to its own directory:
#   projects/<project>-<bug_id>/
#
# bugsinpy-checkout places the repo at <work_dir>/<project>/, so we redirect
# to a temp directory and then move the inner folder to the desired location.

log "=== BugsInPy (Python) ==="

if ! command -v bugsinpy-checkout &>/dev/null; then
  err "'bugsinpy-checkout' not found on PATH – skipping Python checkouts."
else
  for proj_dir in "$BSPY_SUBSET"/*/; do
    project="$(basename "$proj_dir")"
    bugs_dir="$proj_dir/bugs"

    if [[ ! -d "$bugs_dir" ]]; then
      err "No bugs/ directory for $project – skipping"
      continue
    fi

    for bug_dir in "$bugs_dir"/*/; do
      bug_id="$(basename "$bug_dir")"
      # Validate that the name is numeric (skip stray files)
      if ! [[ "$bug_id" =~ ^[0-9]+$ ]]; then
        continue
      fi

      target="$PROJECTS_DIR/${project}-${bug_id}"

      if [[ -d "$target" ]]; then
        skip "${project}-${bug_id} already exists at $target"
        continue
      fi

      log "Checking out $project bug $bug_id (fixed) → $target"

      tmpdir="$(mktemp -d)"
      trap 'rm -rf "$tmpdir"' EXIT

      if bugsinpy-checkout -p "$project" -i "$bug_id" -v 0 -w "$tmpdir"; then
        mv "$tmpdir/$project" "$target"
      else
        err "bugsinpy-checkout failed for $project bug $bug_id"
        rm -rf "$tmpdir"
      fi

      trap - EXIT
      rm -rf "$tmpdir"
    done
  done
fi

log "=== Done. Checked-out projects are in $PROJECTS_DIR ==="
