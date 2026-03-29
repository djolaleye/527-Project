# BugsInPy Filtered Subset

This directory contains a curated subset of the [BugsInPy](https://github.com/soarsmu/BugsInPy) benchmark, filtered for use in mutation testing experiments.

## Filtering Criteria

Inspired by the subject selection methodology in [PANTA (Gu et al., 2025)](https://github.com/PANTA-TestAutomation/Panta), bugs are selected based on:

1. **Single-file fix**: The bug patch modifies exactly one `.py` source file (≤100 lines changed).
2. **Non-abstract, public classes**: The patched code must touch at least one class that is not abstract (no `ABC`/`ABCMeta` inheritance, no `@abstractmethod` decorators) and whose name does not start with `_`.
3. **At least one non-private method**: The class must contain at least one method whose name does not start with `_` (dunder methods like `__init__` are excluded from this count).
4. **Limited cyclomatic complexity**: No method in the class exceeds CC ≤ 15 (per `radon`), and the file is ≤ 500 SLOC.
5. **Mutation feasibility**: The above constraints collectively ensure mutation runs (via MutPy) complete in reasonable time.

## Directory Structure

After running the filter script, this directory is populated with:

```
bugsinpy-subset/
├── README.md
└── projects/
    ├── <project_name>/
    │   ├── project.info          # Upstream GitHub URL and metadata
    │   └── bugs/
    │       ├── <bug_id>/
    │       │   ├── bug.info      # Commit hashes, Python version, test file
    │       │   ├── bug_patch.txt # Unified diff of the fix
    │       │   └── ...           # Other BugsInPy artifacts
    │       └── ...
    └── ...
```

Accompanying CSV/JSON manifests with filtering metadata are written to `results/`:
- `results/bugsinpy_filtered.csv`
- `results/bugsinpy_filtered.json`

## How to Reproduce

### Prerequisites

```bash
pip install -r requirements.txt
```

Optionally set a GitHub token for higher API rate limits:
```bash
export GITHUB_TOKEN=ghp_your_token_here
```

### Run the Filter Script

From the project root (`527-Project/`):

```bash
python -m src.utils.bugsinpy.filter_bugsinpy
```

This will:
1. Clone the BugsInPy repository into `bugsinpy-repo/`
2. Analyze all 493 bugs across 17 projects
3. Apply the two-tier filtering pipeline (patch-based, then AST + complexity)
4. Write `results/bugsinpy_filtered.csv` and `.json`
5. Copy passing bug artifacts into `bugsinpy-subset/projects/`

### Options

| Flag | Description |
|------|-------------|
| `--verbose` / `-v` | Show per-bug filtering decisions |
| `--skip-clone` | Reuse existing BugsInPy clone (skip `git clone`/`pull`) |
| `--skip-copy` | Only produce CSV/JSON, don't copy bug directories |
| `--bugsinpy-dir PATH` | Custom path to BugsInPy clone |
| `--output-dir PATH` | Custom path for CSV/JSON output |
| `--subset-dir PATH` | Custom path for copied bug artifacts |

### Using the Subset with BugsInPy Tools

Once populated, the bugs in this subset can be checked out and tested using the BugsInPy CLI:

```bash
# Add BugsInPy tools to PATH
export PATH=$PATH:/path/to/bugsinpy-repo/framework/bin

# Checkout a specific bug (buggy version)
bugsinpy-checkout -p <project> -v 0 -i <bug_id> -w /tmp/workspace

# Checkout the fixed version
bugsinpy-checkout -p <project> -v 1 -i <bug_id> -w /tmp/workspace

# Run the bug-revealing test
bugsinpy-test -p <project> -i <bug_id> -w /tmp/workspace
```

### Running MutPy on a Bug

```bash
# Checkout fixed version
bugsinpy-checkout -p <project> -v 1 -i <bug_id> -w /tmp/workspace
cd /tmp/workspace

# Run MutPy against the test
mut.py --target <module_path> --unit-test <test_module> --runner pytest
```

## Adjusting Thresholds

Edit `src/utils/bugsinpy/config.py` to change filtering parameters:

- `MAX_CC_PER_METHOD` — max cyclomatic complexity per method (default: 15)
- `MAX_FILE_SLOC` — max source lines of code per file (default: 500)
- `MAX_PATCH_LINES` — max total lines changed in patch (default: 100)
