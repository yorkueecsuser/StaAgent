class BuggyExceptionCreation {
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug(int x) {
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative");

        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code should never be executed");
        }
    }
}