#!/usr/bin/env bash
# Run the full BugFarm pipeline from the repo root.
# Usage: bash scripts/run_bugFarm.sh

set -euo pipefail

WORKDIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$WORKDIR"

bash scripts/method_extractor.sh  method_extractor.log 8
bash scripts/extract_attentions.sh attention_extractor.log codebert base 0
bash scripts/analyze_attentions.sh attention_analyzer.log codebert base 10 8

bash scripts/prompting.sh    codebert base
bash scripts/parse_response.sh parse_chatgpt.log codebert base 8
bash scripts/bug_selection.sh  bug_selection.log  codebert base 0
