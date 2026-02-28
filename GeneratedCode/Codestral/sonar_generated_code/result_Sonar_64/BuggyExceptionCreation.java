class BuggyExceptionCreation {
    // Method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug(int x) {
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative");

        // Mutant: Unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop");
        }
    }
}