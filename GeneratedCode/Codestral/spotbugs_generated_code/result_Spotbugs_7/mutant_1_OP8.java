class InfiniteRecursionBug {
    public void s() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        infiniteRecursion();
    }
}