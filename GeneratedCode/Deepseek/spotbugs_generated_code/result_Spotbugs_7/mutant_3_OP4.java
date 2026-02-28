class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        boolean shouldRecurse = getCondition();
        if (shouldRecurse) {
            // Unreachable branch
            infiniteRecursion();
        } else {
            // This branch will never be executed
            System.out.println("This branch will never be executed.");
        }
    }

    private boolean getCondition() {
        // Return false to make the if branch unreachable
        return false;
    }
}