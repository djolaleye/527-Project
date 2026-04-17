#!/usr/bin/env bash

WORKDIR="$(pwd)"
export PYTHONPATH=$WORKDIR
export PYTHONIOENCODING=utf-8

function prompt() {
    echo
    echo "Syntax: bash scripts/analyze_attentions.sh LOG_FILE_NAME MODEL_NAME MODEL_SIZE THRESHOLD NUM_WORKERS"
    echo "LOG_FILE_NAME is required"
    echo "MODEL_NAME is required [one of codebert, codet5, NatGen]"
    echo "MODEL_SIZE is required [base]"
    echo "THRESHOLD is required"
    echo "NUM_WORKERS is required"
    exit 1
}

while getopts ":h" option; do
    case $option in
        h) prompt ;;
    esac
done

if [[ $# -lt 5 ]]; then
    prompt
fi

LOG_FILE_NAME=$1
MODEL_NAME=$2
MODEL_SIZE=$3
THRESHOLD=$4
NUM_WORKERS=$5

projects=("commons-cli" "commons-csv")

for project in "${projects[@]}"; do
    python3 src/bugfarm/attention_analyzer.py \
        --project_name "$project" \
        --model_type "$MODEL_NAME" \
        --model_size "$MODEL_SIZE" \
        --log_file "$LOG_FILE_NAME" \
        --threshold "$THRESHOLD" \
        --num_workers "$NUM_WORKERS"
done
