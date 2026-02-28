class BuggyCode {

    public boolean showBug(boolean input) {
        boolean unreachable = getUnreachableCondition();
        while (unreachable) {
            // This loop is unreachable
            int x = 10; // Added line to avoid empty block error
        }

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }
        return false;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}