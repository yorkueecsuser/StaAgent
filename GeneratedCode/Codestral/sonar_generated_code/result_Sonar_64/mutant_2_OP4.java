class BuggyExceptionCreation {
    public void showBug(int x) {
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown

        // Start of the mutant
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This is an unreachable branch.");
        }
        // End of the mutant
    }

    // Method to simulate a false condition
    private boolean getUnreachableCondition() {
        return false;
    }
}