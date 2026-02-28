class NonNegativeComparisonBug {

    // Method to demonstrate the bug
    public boolean showBug(int nonNegativeValue) {
        // BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
        return nonNegativeValue < 0;
    }

    public static void main(String[] args) {
        NonNegativeComparisonBug bugDemo = new NonNegativeComparisonBug();
        
        // Adding a loop that does not affect the existing logic
        int i = 0;
        while (i < 1) {
            System.out.println(bugDemo.showBug(5));  // Expected to return false, but the comparison is incorrect
            i++;
        }

        // Equivalent Loop Replacement: Replacing the while loop with a do-while loop
        int j = 0;
        do {
            System.out.println(bugDemo.showBug(5));  // Expected to return false, but the comparison is incorrect
            j++;
        } while (j < 1);
    }
}