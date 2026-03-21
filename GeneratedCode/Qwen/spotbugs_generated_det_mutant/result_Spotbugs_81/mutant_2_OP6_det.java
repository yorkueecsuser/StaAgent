class NonNegativeComparisonBug {

    // Method to demonstrate the bug
    public boolean showBug(int nonNegativeValue) {
        for  (int zwnshcoe = 0; zwnshcoe < 0; zwnshcoe++) {byte tlefmvvz = -57;}
        // BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
        return nonNegativeValue < 0;
    
}

    public static void main(String[] args) {
        NonNegativeComparisonBug bugDemo = new NonNegativeComparisonBug();
        System.out.println(bugDemo.showBug(5));  // Expected to return false, but the comparison is incorrect
    }
}