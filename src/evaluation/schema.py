from __future__ import annotations

import json
from pathlib import Path
from typing import Iterable, Iterator, List, Literal, Optional

from pydantic import BaseModel, Field

ToolName = Literal["pit", "leam", "bugfarm", "sweagent"]
TestStatus = Literal["killed", "survived", "timeout", "invalid", "unrun"]
EquivalentLabel = Literal["unknown", "likely", "confirmed"]


class MutantRecord(BaseModel):
    tool: ToolName
    mutant_id: str
    project: str

    patch: Optional[str] = None
    patch_descriptor: Optional[str] = None

    file: Optional[str] = None
    line: Optional[int] = None
    operator: Optional[str] = None
    intent: Optional[str] = None
    expected_behavior_change: Optional[str] = None

    compiles: Optional[bool] = None
    test_status: TestStatus = "unrun"
    killing_tests: List[str] = Field(default_factory=list)

    generation_time_s: float = 0.0
    test_time_s: float = 0.0
    generation_time_estimated: bool = False

    semantic_duplicate_of: Optional[str] = None
    near_duplicate_of: Optional[str] = None
    behavioral_duplicate_of: Optional[str] = None
    equivalent_label: EquivalentLabel = "unknown"

    model: Optional[str] = None
    tokens_in: Optional[int] = None
    tokens_out: Optional[int] = None
    trajectory: Optional[str] = None

    extra: dict = Field(default_factory=dict)


def load_jsonl(path: str | Path) -> List[MutantRecord]:
    path = Path(path)
    if not path.exists():
        return []
    
    out: List[MutantRecord] = []

    with path.open("r", encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if not line:
                continue
            out.append(MutantRecord.model_validate_json(line))

    return out


def dump_jsonl(records: Iterable[MutantRecord], path: str | Path) -> None:
    path = Path(path)
    path.parent.mkdir(parents=True, exist_ok=True)

    with path.open("w", encoding="utf-8") as f:
        for rec in records:
            f.write(rec.model_dump_json(exclude_none=False))
            f.write("\n")


def iter_jsonl(path: str | Path) -> Iterator[MutantRecord]:
    path = Path(path)

    with path.open("r", encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if not line:
                continue
            yield MutantRecord.model_validate_json(line)


def append_jsonl(record: MutantRecord, path: str | Path) -> None:
    path = Path(path)
    path.parent.mkdir(parents=True, exist_ok=True)

    with path.open("a", encoding="utf-8") as f:
        f.write(record.model_dump_json(exclude_none=False))
        f.write("\n")


def write_json(obj: dict, path: str | Path) -> None:
    path = Path(path)
    path.parent.mkdir(parents=True, exist_ok=True)
    
    with path.open("w", encoding="utf-8") as f:
        json.dump(obj, f, indent=2)
