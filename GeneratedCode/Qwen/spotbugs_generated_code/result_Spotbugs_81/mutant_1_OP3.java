class NonNegativeComparisonBug {

    // Method to demonstrate the bug
    public boolean showBug(int nonNegativeValue) {
        // BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
        return nonNegativeValue < 0;

        // Mutant: Inserting an unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
    }

    // Method to provide a dynamically determined false condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        NonNegativeComparisonBug bugDemo = new NonNegativeComparisonBug();
        System.out.println(bugDemo.showBug(5));  // Expected to return false, but the comparison is incorrect
    }
}