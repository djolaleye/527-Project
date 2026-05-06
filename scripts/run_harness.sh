#!/usr/bin/env bash
# Run the unified mutant harness across both projects.
# Optimized for speed: parallel workers, in-memory restore, single warmup.
#
# Usage:
#   bash scripts/run_harness.sh                              # all tools, both projects
#   WORKERS=4 bash scripts/run_harness.sh                    # custom worker count
#   TOOLS=sweagent bash scripts/run_harness.sh               # subset of tools
#   PROJECTS="commons-csv" bash scripts/run_harness.sh       # one project

set -euo pipefail

REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$REPO_ROOT"

WORKERS="${WORKERS:-8}"
TIMEOUT="${TIMEOUT:-180}"
TOOLS="${TOOLS:-sweagent,bugfarm,leam}"
PROJECTS="${PROJECTS:-commons-cli commons-csv}"

for proj in $PROJECTS; do
  echo "=== $proj ==="
  python3 -m src.evaluation.run_harness \
    --project "$proj" \
    --tools "$TOOLS" \
    --workers "$WORKERS" \
    --timeout "$TIMEOUT"
done
