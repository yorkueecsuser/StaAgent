class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        boolean shouldRecurse = getCondition();
        if (shouldRecurse) {
            infiniteRecursion();
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false to make the recursive call unreachable
    }
}