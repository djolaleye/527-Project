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
  ["Csv"]="commons-csv"
)

# ── Defects4J checkouts ───────────────────────────────────────────────────────
# Each entry in defects4j-subset/ is named <Project>-<BugId>f (e.g. Cli-40f).
# We parse the project name and bug ID from the directory name, then run:
#   defects4j checkout -p <Project> -v <BugId>f -w projects/<canonical-name>

log "=== Defects4J (Java) ==="

# defects4j-subset/ already contains pre-checked-out fixed-version sources
# for each bug, so we copy them directly rather than invoking `defects4j`.
for entry in "$D4J_SUBSET"/*/; do
  dir_name="$(basename "$entry")"

  # Parse: strip trailing 'f', split on last '-'
  without_f="${dir_name%f}"                   # e.g. Cli-40
  d4j_project="${without_f%-*}"               # e.g. Cli
  bug_id="${without_f##*-}"                   # e.g. 40

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

  log "Copying $d4j_project bug $bug_id (fixed) → $target"
  cp -a "$entry" "$target"
done

log "=== Done. Checked-out projects are in $PROJECTS_DIR ==="
