class BuggyExceptionCreation {
    public void showBug(int x) {
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative");

        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This is an unreachable block");
        }
    }

    // Dummy method to return a false condition
    private boolean getUnreachableCondition() {
        return false;
    }
}