#!/usr/bin/env bash

WORKDIR="$(pwd)"
export PYTHONPATH=$WORKDIR
export PYTHONIOENCODING=utf-8

function prompt() {
    echo
    echo "Syntax: bash scripts/method_extractor.sh LOG_FILE_NAME NUM_WORKERS"
    echo "LOG_FILE_NAME is required"
    echo "NUM_WORKERS is required"
    exit 1
}

while getopts ":h" option; do
    case $option in
        h) prompt ;;
    esac
done

if [[ $# -lt 2 ]]; then
    prompt
fi

LOG_FILE_NAME=$1
NUM_WORKERS=$2

projects=(
    "commons-cli" "commons-codec" "commons-collections" "commons-compress" "commons-csv"
    "commons-jxpath" "commons-lang" "commons-math"
    "gson" "jackson-core" "jackson-databind" "jackson-dataformat-xml"
    "joda-time" "jsoup"
)

for project in "${projects[@]}"; do
    python3 src/bugfarm/method_extractor.py \
        --project_name "$project" \
        --log_file "$LOG_FILE_NAME" \
        --num_workers "$NUM_WORKERS"
done
