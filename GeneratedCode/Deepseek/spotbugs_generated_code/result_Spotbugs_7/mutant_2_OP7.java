class InfiniteRecursionBug {
    public void showBug() {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("This line is unreachable.");
        }
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        infiniteRecursion();
    }
}