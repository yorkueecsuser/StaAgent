class BuggyExceptionCreation {
    private boolean getCondition() {
        return false; // Always false to make the loop unreachable
    }

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative");
        }
        // Mutant code: Adding an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never be executed
            System.out.println("This is an unreachable while loop");
        }
    }
}