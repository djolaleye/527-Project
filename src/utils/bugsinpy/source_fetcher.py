import logging
import os
import time
from urllib.parse import urlparse

import requests

from .config import REQUEST_DELAY

logger = logging.getLogger(__name__)

_last_request_time = 0.0


def _rate_limit():
    """Enforce minimum delay between requests."""
    global _last_request_time
    elapsed = time.time() - _last_request_time
    if elapsed < REQUEST_DELAY:
        time.sleep(REQUEST_DELAY - elapsed)
    _last_request_time = time.time()


def _parse_github_url(github_url: str) -> tuple[str, str]:
    """Extract owner and repo from a GitHub URL."""
    parsed = urlparse(github_url.rstrip("/"))
    parts = parsed.path.strip("/").split("/")
    
    if len(parts) >= 2:
        return parts[0], parts[1].replace(".git", "")
    raise ValueError(f"Cannot parse GitHub URL: {github_url}")


def fetch_file_from_github(
    github_url: str, commit_hash: str, file_path: str
) -> str | None:
    """Fetch a file from GitHub at a specific commit using raw content URL."""
    owner, repo = _parse_github_url(github_url)
    raw_url = f"https://raw.githubusercontent.com/{owner}/{repo}/{commit_hash}/{file_path}"

    headers = {}
    token = os.environ.get("GITHUB_TOKEN")
    if token:
        headers["Authorization"] = f"token {token}"

    max_retries = 3
    for attempt in range(max_retries):
        _rate_limit()
        try:
            resp = requests.get(raw_url, headers=headers, timeout=30)
            if resp.status_code == 200:
                return resp.text
            elif resp.status_code == 404:
                logger.debug("File not found: %s", raw_url)
                return None
            elif resp.status_code == 429:
                wait = 2 ** (attempt + 1)
                logger.warning("Rate limited, waiting %ds...", wait)
                time.sleep(wait)
                continue
            else:
                logger.warning("HTTP %d for %s", resp.status_code, raw_url)
                return None
        except requests.RequestException as e:
            logger.warning("Request failed for %s: %s", raw_url, e)
            if attempt < max_retries - 1:
                time.sleep(2 ** attempt)
                continue
            return None

    return None
