class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        recursiveMethod(); // Mutant code: Renamed infiniteRecursion to recursiveMethod
    }

    private void recursiveMethod() {
        recursiveMethod(); // Keeping the bug intact
    }
}