import ast
import logging

from .models import ClassInfo, MethodInfo

logger = logging.getLogger(__name__)

# Known ABC base class names
ABC_BASES = {"ABC", "ABCMeta", "abc.ABC", "abc.ABCMeta"}


def _get_base_name(node: ast.expr) -> str:
    """Extract the name string from a base class node."""
    if isinstance(node, ast.Name):
        return node.id
    elif isinstance(node, ast.Attribute):
        parts = []
        current = node
        while isinstance(current, ast.Attribute):
            parts.append(current.attr)
            current = current.value
        if isinstance(current, ast.Name):
            parts.append(current.id)
        return ".".join(reversed(parts))
    return ""


def _has_abstractmethod_decorator(func_node: ast.FunctionDef) -> bool:
    """Check if a function has @abstractmethod decorator."""
    for dec in func_node.decorator_list:
        if isinstance(dec, ast.Name) and dec.id == "abstractmethod":
            return True
        if isinstance(dec, ast.Attribute) and dec.attr == "abstractmethod":
            return True
    return False


def is_abstract_class(class_node: ast.ClassDef) -> bool:
    """Check if a class is abstract (inherits ABC or has @abstractmethod methods)."""
    for base in class_node.bases:
        if _get_base_name(base) in ABC_BASES:
            return True

    # Also check metaclass keyword
    for keyword in class_node.keywords:
        if keyword.arg == "metaclass":
            if _get_base_name(keyword.value) in {"ABCMeta", "abc.ABCMeta"}:
                return True

    # Check if any method uses @abstractmethod
    for node in ast.walk(class_node):
        if isinstance(node, (ast.FunctionDef, ast.AsyncFunctionDef)):
            if _has_abstractmethod_decorator(node):
                return True

    return False


def is_public_class(class_node: ast.ClassDef) -> bool:
    """Class name does not start with underscore."""
    return not class_node.name.startswith("_")


def _is_dunder(name: str) -> bool:
    """Check if a method name is a dunder (e.g., __init__, __str__)."""
    return name.startswith("__") and name.endswith("__")


def _is_non_private_method(func_node: ast.FunctionDef) -> bool:
    """A non-private method: name does not start with underscore (excluding dunders)."""
    name = func_node.name
    if _is_dunder(name):
        return False
    return not name.startswith("_")


def _get_end_line(node: ast.AST) -> int:
    """Get the end line of an AST node."""
    if hasattr(node, "end_lineno") and node.end_lineno is not None:
        return node.end_lineno
    # Fallback: find max line number in children
    max_line = getattr(node, "lineno", 0)
    for child in ast.walk(node):
        line = getattr(child, "lineno", 0)
        if line > max_line:
            max_line = line
    return max_line


def analyze_classes(source_code: str) -> list[ClassInfo]:
    """Parse source and extract all class definitions with method info."""
    try:
        tree = ast.parse(source_code)
    except SyntaxError as e:
        logger.warning("Failed to parse source: %s", e)
        return []

    classes = []
    for node in ast.walk(tree):
        if not isinstance(node, ast.ClassDef):
            continue

        methods = []
        for item in node.body:
            if isinstance(item, (ast.FunctionDef, ast.AsyncFunctionDef)):
                methods.append(MethodInfo(
                    name=item.name,
                    is_public=_is_non_private_method(item),
                    start_line=item.lineno,
                    end_line=_get_end_line(item),
                ))

        bases = [_get_base_name(b) for b in node.bases]

        classes.append(ClassInfo(
            name=node.name,
            bases=bases,
            is_abstract=is_abstract_class(node),
            is_public=is_public_class(node),
            methods=methods,
            start_line=node.lineno,
            end_line=_get_end_line(node),
        ))

    return classes


def find_changed_classes(
    source_code: str, changed_lines: list[int]
) -> list[ClassInfo]:
    """Find classes that overlap with changed lines and pass all filters."""
    all_classes = analyze_classes(source_code)
    changed_set = set(changed_lines)

    matching = []
    for cls in all_classes:
        # Check if any changed line falls within this class's range
        class_lines = set(range(cls.start_line, cls.end_line + 1))
        if not class_lines & changed_set:
            continue
        matching.append(cls)

    return matching


def class_passes_filters(cls: ClassInfo) -> bool:
    """Check: not abstract, is public, has >= 1 non-private method."""
    if cls.is_abstract:
        return False
    if not cls.is_public:
        return False
    non_private = [m for m in cls.methods if m.is_public]
    if len(non_private) < 1:
        return False
    return True
