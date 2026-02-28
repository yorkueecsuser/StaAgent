class BuggyCode {

    public boolean showBug(boolean input) {
        boolean i = input; // New variable 'i' assigned the value of 'input'
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (i = true) { // The '=' is a mistake, this should be '=='
            return true;
        }
        return false;
    }
}