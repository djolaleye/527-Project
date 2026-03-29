from pathlib import Path

# Project root (527-Project/)
PROJECT_ROOT = Path(__file__).resolve().parent.parent.parent.parent

# BugsInPy repository
BUGSINPY_REPO_URL = "https://github.com/soarsmu/BugsInPy.git"
BUGSINPY_LOCAL_PATH = PROJECT_ROOT / "bugsinpy-repo"

# Filtering thresholds
MAX_CC_PER_METHOD = 15
MAX_FILE_SLOC = 500
MAX_PATCH_LINES = 100

# Output directories
OUTPUT_DIR = PROJECT_ROOT / "results"
SUBSET_DIR = PROJECT_ROOT / "bugsinpy-subset"

# Rate limiting for GitHub fetches
REQUEST_DELAY = 0.5  # seconds between requests

# All BugsInPy projects
PROJECTS = [
    "PySnooper", "ansible", "black", "cookiecutter", "fastapi",
    "httpie", "keras", "luigi", "matplotlib", "pandas",
    "sanic", "scrapy", "spacy", "thefuck", "tornado",
    "tqdm", "youtube-dl",
]
