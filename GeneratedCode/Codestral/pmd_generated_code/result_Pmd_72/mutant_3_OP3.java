class BuggyEJB {

    private static int CountA = 0;

    public void incrementCount() {
        CountA++;
        if (getUnreachableCondition()) {
            int x = 1 / 0; // This line will never be executed, but it's added to avoid compile-time errors
        }
    }

    public int showBug() {
        return CountA;
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if statement unreachable
    }
}