class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion();
    }

    private void infiniteRecursion() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Mutant: Unreachable for loop
            // Do nothing, this loop is unreachable
        }
        infiniteRecursion();
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}