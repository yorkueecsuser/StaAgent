class NonNegativeComparisonBug {

    // Method to demonstrate the bug
    public boolean showBug(int nonNegativeValue) {
        // BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
        return nonNegativeValue < 0;

        // Inserting an unreachable if-else branch
        boolean shouldRun = false; // This variable ensures the if-else block is unreachable
        if (shouldRun) {
            System.out.println("This is an unreachable if block");
        } else {
            System.out.println("This is an unreachable else block");
        }
    }

    public static void main(String[] args) {
        NonNegativeComparisonBug bugDemo = new NonNegativeComparisonBug();
        System.out.println(bugDemo.showBug(5));  // Expected to return false, but the comparison is incorrect
    }
}