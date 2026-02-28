class InfiniteRecursionBug {
    private static boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        while (getFalseCondition()) { // Mutant: Unreachable while loop
            // This loop will never execute
        }
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        infiniteRecursion();
    }
}