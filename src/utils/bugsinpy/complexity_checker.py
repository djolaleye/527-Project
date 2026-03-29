import logging

from radon.complexity import cc_visit
from radon.raw import analyze as raw_analyze

from .config import MAX_CC_PER_METHOD, MAX_FILE_SLOC
from .models import ComplexityResult, FileMetrics

logger = logging.getLogger(__name__)


def compute_class_complexity(source_code: str, class_name: str) -> ComplexityResult | None:
    """Compute per-method cyclomatic complexity for a given class."""
    try:
        results = cc_visit(source_code)
    except Exception as e:
        logger.warning("Failed to compute complexity: %s", e)
        return None

    per_method: dict[str, int] = {}
    for block in results:
        # radon returns class methods as ClassName.method_name
        if hasattr(block, "classname") and block.classname == class_name:
            per_method[block.name] = block.complexity
        # Also check top-level class blocks
        elif block.name == class_name and hasattr(block, "methods"):
            for method in block.methods:
                per_method[method.name] = method.complexity

    if not per_method:
        return None

    values = list(per_method.values())
    return ComplexityResult(
        per_method=per_method,
        max_cc=max(values),
        average_cc=sum(values) / len(values),
    )


def compute_file_metrics(source_code: str) -> FileMetrics | None:
    """Compute LOC and SLOC for a source file."""
    try:
        result = raw_analyze(source_code)
        return FileMetrics(loc=result.loc, sloc=result.sloc)
    except Exception as e:
        logger.warning("Failed to compute file metrics: %s", e)
        return None


def passes_complexity_filter(
    complexity: ComplexityResult | None, metrics: FileMetrics | None
) -> bool:
    """Check complexity and size against configured thresholds."""
    if metrics and metrics.sloc > MAX_FILE_SLOC:
        return False
    if complexity and complexity.max_cc > MAX_CC_PER_METHOD:
        return False
    return True
