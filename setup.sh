#!/usr/bin/env bash
# setup.sh — local (non-Docker) environment bootstrap.
# In the Docker image, Python deps are installed as image layers; this script
# is still useful for local development or CI environments without Docker.
#
# Usage:
#   bash setup.sh                  # install deps + checkout + build
#   SKIP_PROJECTS=true bash setup.sh   # install deps only (used during Docker build)

set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

function install_requirements() {
    echo "=== Installing Python requirements ==="
    pip3 install --no-cache-dir -r "$SCRIPT_DIR/requirements.txt"

    pip3 install --no-cache-dir \
        ansi==0.3.6 \
        matplotlib==3.3.4 \
        nltk==3.6.7 \
        numpy==1.21.6 \
        seaborn==0.12.2 \
        "torch==1.12.1" \
        "transformers==4.22.2" \
        wordninja==2.0.0

    pip3 install --no-cache-dir \
        git+https://github.com/jose/javalang.git@start_position_and_end_position

    echo "=== Setting up source-code-tokenizer ==="
    if [ ! -d "$SCRIPT_DIR/source-code-tokenizer" ]; then
        git clone https://github.com/devreplay/source-code-tokenizer.git \
            "$SCRIPT_DIR/source-code-tokenizer"
    fi
    
    cd "$SCRIPT_DIR/source-code-tokenizer"
    npm install
    npm link
    cd "$SCRIPT_DIR"

    echo "Requirements installation completed."
}

function checkout_projects() {
    echo "=== Checking out benchmark projects ==="
    bash "$SCRIPT_DIR/scripts/checkout_projects.sh" --root "$SCRIPT_DIR"
    echo "Project checkout completed."
}

function build_projects() {
    echo "=== Building Java projects with Maven ==="
    local main="$SCRIPT_DIR"

    # These projects require Java 8 (compilation fails under Java 11+)
    local java8_projects=("commons-lang" "joda-time")

    for project_path in "$SCRIPT_DIR"/projects/*/; do
        local project_name
        project_name="$(basename "$project_path")"

        if [ ! -f "$project_path/pom.xml" ]; then
            echo "  Skipping $project_name (no pom.xml)"
            continue
        fi

        echo "  Building $project_name"
        cd "$project_path"

        if [[ " ${java8_projects[*]} " == *" $project_name "* ]]; then
            echo "  Using Java 8"
            if [ -f /usr/local/bin/use_java8 ]; then
                # shellcheck disable=SC1091
                source /usr/local/bin/use_java8
                mvn test -q --log-file build.log || true
                # shellcheck disable=SC1091
                source /usr/local/bin/use_java11
            else
                JAVA_HOME="$(/usr/libexec/java_home -v 1.8 2>/dev/null || echo "$JAVA_8_HOME")" \
                    mvn test -q --log-file build.log || true
            fi
        else
            mvn test -q --log-file build.log || true
        fi

        cd "$main"
    done

    echo "Build step completed."
}

# ── Main ─────────────────────────────────────────────────────────────────────
mkdir -p "$SCRIPT_DIR/logs" "$SCRIPT_DIR/data"

echo "=== Starting setup $(date) ==="

install_requirements

if [ "${SKIP_PROJECTS:-false}" != "true" ]; then
    checkout_projects
    build_projects
else
    echo "Skipping project checkout and build (SKIP_PROJECTS=true)"
fi

echo "=== Setup completed successfully $(date) ==="
