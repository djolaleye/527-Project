from __future__ import annotations

import argparse
import re
import shutil
import subprocess
import time
import xml.etree.ElementTree as ET
from pathlib import Path
from typing import Optional

from .schema import MutantRecord, append_jsonl

"""
Run PIT mutation testing on a Defects4J-subset project (or parse an existing report)
and normalize each mutant into a MutantRecord.

PIT writes mutations.xml under target/pit-reports/<timestamp>/.

Usage:
    python -m src.evaluation.pit_collector --project commons-cli
    python -m src.evaluation.pit_collector --project commons-cli --skip-run  # just parse
"""

REPO_ROOT = Path(__file__).resolve().parents[2]

PROJECT_DIRS = {
    "commons-cli": REPO_ROOT / "defects4j-subset" / "Cli-40f",
    "commons-csv": REPO_ROOT / "defects4j-subset" / "Csv-16f",
}

DEFAULT_OUT_ROOT = REPO_ROOT / "mutants" / "pit"

# PIT status -> unified test_status
PIT_STATUS_MAP = {
    "KILLED": "killed",
    "SURVIVED": "survived",
    "TIMED_OUT": "timeout",
    "NO_COVERAGE": "survived",
    "NON_VIABLE": "invalid",
    "MEMORY_ERROR": "invalid",
    "RUN_ERROR": "invalid",
}


def run_pitest(project_dir: Path) -> float:
    """Run PIT against the project, returning wall-clock seconds."""
    cmd = [
        "mvn",
        "org.pitest:pitest-maven:mutationCoverage",
        "-DoutputFormats=XML",
        "-DtimestampedReports=false",
        #"-DfullMutationMatrix=true",
    ]

    t0 = time.perf_counter()
    proc = subprocess.run(cmd, cwd=project_dir, capture_output=True, text=True)
    elapsed = time.perf_counter() - t0

    if proc.returncode != 0:
        tail = (proc.stderr or proc.stdout or "")[-1500:]
        raise RuntimeError(f"PIT run failed (rc={proc.returncode}):\n{tail}")

    return elapsed


def find_mutations_xml(project_dir: Path) -> Path:
    """Locate mutations.xml."""
    base = project_dir / "target" / "pit-reports"
    direct = base / "mutations.xml"
    if direct.exists():
        return direct

    candidates = sorted(base.rglob("mutations.xml"), key=lambda p: p.stat().st_mtime, reverse=True)
    if not candidates:
        raise FileNotFoundError(f"No mutations.xml under {base}")
    
    return candidates[0]


def _text(elem: Optional[ET.Element]) -> Optional[str]:
    if elem is None:
        return None
    
    t = (elem.text or "").strip()
    return t or None


def _parse_killing_tests(mutation: ET.Element) -> list[str]:
    out: list[str] = []

    succeeding = mutation.find("succeedingTests")
    killing = mutation.find("killingTests")

    for node in (killing, succeeding):
        if node is None:
            continue

        text = _text(node)
        if not text:
            continue

        out.extend([t.strip() for t in text.split("|") if t.strip()])

    return out if mutation.find("killingTests") is not None else []


def parse_mutations_xml(xml_path: Path, proj: str, gen_time_total: float) -> list[MutantRecord]:
    tree = ET.parse(xml_path)
    root = tree.getroot()

    mutations = list(root.findall("mutation"))
    n = len(mutations)
    per_mutant_gen = (gen_time_total / n) if (gen_time_total > 0 and n > 0) else 0.0

    records: list[MutantRecord] = []

    for i, m in enumerate(mutations, start=1):
        status_attr = m.get("status", "").upper()
        detected_attr = m.get("detected", "").lower()

        test_status = PIT_STATUS_MAP.get(status_attr, "survived")
        compiles = test_status != "invalid"

        mutated_class = _text(m.find("mutatedClass"))
        mutated_method = _text(m.find("mutatedMethod"))
        source_file = _text(m.find("sourceFile"))
        line_number = _text(m.find("lineNumber"))
        mutator = _text(m.find("mutator"))
        description = _text(m.find("description"))

        killing = []
        kt_node = m.find("killingTests")
        if kt_node is not None and (kt_node.text or "").strip():
            killing = [t.strip() for t in kt_node.text.split("|") if t.strip()]

        descriptor_parts = [
            source_file or "<unknown>",
            f"L{line_number}" if line_number else "L?",
            mutator.split(".")[-1] if mutator else "<mutator>",
        ]

        if description:
            descriptor_parts.append(description)
        descriptor = " :: ".join(descriptor_parts)

        rec = MutantRecord(
            tool="pit",
            mutant_id=f"M{i:04d}",
            project=proj,
            patch=None,
            patch_descriptor=descriptor,
            file=source_file,
            line=int(line_number) if line_number and line_number.isdigit() else None,
            operator=mutator,
            compiles=compiles,
            test_status=test_status,
            killing_tests=killing,
            generation_time_s=per_mutant_gen,
            generation_time_estimated=True,
            extra={
                "pit_status": status_attr,
                "pit_detected": detected_attr,
                "mutated_class": mutated_class,
                "mutated_method": mutated_method,
                "description": description,
            },
        )
        records.append(rec)

    return records


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--project", required=True, choices=sorted(PROJECT_DIRS))
    ap.add_argument("--out", type=Path, default=DEFAULT_OUT_ROOT)
    ap.add_argument("--skip-run", action="store_true", help="Parse existing target/pit-reports/mutations.xml; don't re-run mvn.")
    args = ap.parse_args()

    project_dir = PROJECT_DIRS[args.project]

    gen_time_total = 0.0
    if not args.skip_run:
        print(f"running PIT in {project_dir}…")
        gen_time_total = run_pitest(project_dir)
        print(f"PIT finished in {gen_time_total:.1f}s")

    xml_path = find_mutations_xml(project_dir)
    print(f"parsing {xml_path}")

    records = parse_mutations_xml(xml_path, args.project, gen_time_total)

    out_dir = args.out / args.project
    out_dir.mkdir(parents=True, exist_ok=True)
    manifest = out_dir / "manifest.jsonl"

    if manifest.exists():
        manifest.unlink()

    for rec in records:
        append_jsonl(rec, manifest)

    archived = out_dir / "mutations.xml"
    shutil.copyfile(xml_path, archived)

    print(f"wrote {len(records)} mutants → {manifest}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
