class BuggyExceptionCreation {
    private boolean getUnreachableCondition() {
        return false; // Always returns false, making the condition unreachable
    }

    public void showBug(int x) {
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative");

        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable branch
            System.out.println("This code is unreachable");
        } else {
            // Alternative branch
            System.out.println("This code runs instead");
        }
    }
}