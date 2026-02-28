class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion();
    }

    private void infiniteRecursion() {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This code should never execute.");
        } else {
            infiniteRecursion(); // Original bug: IL: An apparent infinite recursive loop
        }
    }

    private boolean getCondition() {
        // Replace this with your own logic to determine the condition
        return false;
    }
}