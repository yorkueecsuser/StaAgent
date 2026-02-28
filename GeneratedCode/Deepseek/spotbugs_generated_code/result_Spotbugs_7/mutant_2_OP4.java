class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion();
    }

    private void infiniteRecursion() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable branch
            throw new RuntimeException("Unreachable branch executed");
        } else {
            // Original code
            infiniteRecursion();
        }
    }

    private boolean getUnreachableCondition() {
        // For this mutation, always return false
        return false;
    }
}