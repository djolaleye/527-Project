from pydantic import BaseModel


class BugEntry(BaseModel):
    project: str
    bug_id: int
    path: str


class BugInfo(BaseModel):
    python_version: str
    buggy_commit_id: str
    fixed_commit_id: str
    test_file: str


class PatchInfo(BaseModel):
    num_files_changed: int
    files: list[str]
    lines_added: int
    lines_removed: int
    total_lines_changed: int
    changed_line_numbers: dict[str, list[int]]  # file -> list of changed line numbers


class MethodInfo(BaseModel):
    name: str
    is_public: bool
    start_line: int
    end_line: int


class ClassInfo(BaseModel):
    name: str
    bases: list[str]
    is_abstract: bool
    is_public: bool
    methods: list[MethodInfo]
    start_line: int
    end_line: int


class ComplexityResult(BaseModel):
    per_method: dict[str, int]
    max_cc: int
    average_cc: float


class FileMetrics(BaseModel):
    loc: int
    sloc: int


class FilteredBug(BaseModel):
    project: str
    bug_id: int
    file_path: str
    class_name: str
    num_public_methods: int
    max_complexity: int
    avg_complexity: float
    patch_lines: int
    python_version: str
    test_file: str
    buggy_commit: str
    fixed_commit: str
