class BuggyCode {

    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }

        // Mutation: Unreachable switch statement
        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            int value = 0;
            switch(value) {
                case 1:
                    System.out.println("This code should never be executed.");
                    break;
            }
        }

        return false;
    }
}