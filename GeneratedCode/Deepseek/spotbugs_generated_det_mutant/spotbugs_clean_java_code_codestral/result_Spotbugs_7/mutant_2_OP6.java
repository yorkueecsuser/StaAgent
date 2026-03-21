class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion();
    }

    private void infiniteRecursion() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This is an unreachable loop
            // It's always false, so the loop body will never be executed
        }
        infiniteRecursion();
    }

    private boolean getCondition() {
        return false; // This method always returns false
    }
}