class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        if (getCondition()) { // Mutant code: Unreachable if statement
            // This code is unreachable due to the condition being always false
            System.out.println("This line should never print.");
        }
        infiniteRecursion();
    }

    private boolean getCondition() {
        return false;
    }
}