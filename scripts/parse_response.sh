#!/usr/bin/env bash

WORKDIR="$(pwd)"
export PYTHONPATH=$WORKDIR
export PYTHONIOENCODING=utf-8

function prompt() {
    echo
    echo "Syntax: bash scripts/parse_response.sh LOG_FILE_NAME MODEL_NAME MODEL_SIZE NUM_WORKERS"
    echo "LOG_FILE_NAME is required"
    echo "MODEL_NAME is required [one of codebert, codet5, NatGen]"
    echo "MODEL_SIZE is required [base]"
    echo "NUM_WORKERS is required"
    exit 1
}

while getopts ":h" option; do
    case $option in
        h) prompt ;;
    esac
done

if [[ $# -lt 4 ]]; then
    prompt
fi

LOG_FILE_NAME=$1
MODEL_NAME=$2
MODEL_SIZE=$3
NUM_WORKERS=$4

projects=("commons-cli" "commons-csv")

for project in "${projects[@]}"; do
    python3 src/bugfarm/parse_chatgpt.py \
        --project_name "$project" \
        --model_type "$MODEL_NAME" \
        --model_size "$MODEL_SIZE" \
        --log_file "$LOG_FILE_NAME" \
        --num_workers "$NUM_WORKERS"
done
