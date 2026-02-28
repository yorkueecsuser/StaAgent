class BuggyCode {

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }
        // Mutant code added following the Unreachable if statement mutation operator
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch is unreachable as the condition is always false
            System.out.println("This is an unreachable branch");
        }
        return false;
    }

    // This method is added to simulate a dynamically determined condition
    private boolean getUnreachableCondition() {
        return false;
    }
}