class InfiniteRecursionBug {
    public void showBug() {
        boolean condition = false;
        while (condition) { // unreachable while loop
            // this block will never be executed
        }
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        infiniteRecursion();
    }
}