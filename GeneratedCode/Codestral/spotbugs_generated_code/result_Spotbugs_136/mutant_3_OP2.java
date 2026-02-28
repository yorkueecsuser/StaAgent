class BuggyCode {

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }
        // Mutant code - Duplication of the assignment
        input = true; // This is a duplicate of the line inside the if condition
        return false;
    }
}