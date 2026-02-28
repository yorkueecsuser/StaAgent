class BuggyCode {

    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (input = true) { // The '=' is a mistake, this should be '=='
            // Mutant code: Unreachable while loop
            boolean conditionWhile = getFalseCondition();
            while (conditionWhile) {
                // This code will never execute
            }
            return true;
        }
        return false;
    }
}