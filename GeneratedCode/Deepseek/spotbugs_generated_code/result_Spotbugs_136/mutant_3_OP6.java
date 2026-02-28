class BuggyCode {

    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (input = true) { // The '=' is a mistake, this should be '=='
            // Unreachable for loop mutation
            boolean conditionFor = getFalseCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This should not execute.");
            }
            return true;
        }
        return false;
    }
}