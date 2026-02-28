class BuggyCode {

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }

        // Inserted mutation: Unreachable if statement
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            // This code will never be executed, it's unreachable
            System.out.println("This is an unreachable if statement");
        }

        return false;
    }

    private boolean isUnreachable() {
        // This method will always return false, making the if statement unreachable
        return false;
    }
}