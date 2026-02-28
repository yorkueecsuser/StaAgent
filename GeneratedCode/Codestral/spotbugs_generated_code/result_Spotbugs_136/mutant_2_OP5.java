class BuggyCode {

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }

        // Mutation: Unreachable switch statement
        boolean condition = false;
        int value = getValue();
        switch (condition? value : -1) {
            case 1:
                // This code will never execute
                System.out.println("Unreachable code");
                break;
        }

        return false;
    }

    private int getValue() {
        return 0;
    }
}