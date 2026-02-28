class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion();
    }

    private void infiniteRecursion() {
        boolean shouldLoop = getCondition();
        for (int i = 0; shouldLoop; i++) { // Inserting unreachable for loop
            // This loop will never execute because the condition is always false
        }
        infiniteRecursion();
    }

    private boolean getCondition() {
        return false; // This ensures the loop condition is always false
    }
}