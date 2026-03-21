class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    public void displayBug() {
        showBug(); // This method calls the original showBug method, which contains the bug
    }

    private void infiniteRecursion() {
        infiniteRecursion();
    }
}