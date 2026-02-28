class BuggyCode {

    public boolean showBug(boolean input) {
        boolean temp = input;
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (temp = true) { // The '=' is a mistake, this should be '=='
            return true;
        }
        return false;
    }
}