class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        boolean unreachableCondition = false; // Unreachable if statement mutant
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This statement should never be executed.");
        }
        infiniteRecursion();
    }
}