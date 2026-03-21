class NonNegativeComparisonBug {

    public boolean showBug(int[] values) {
        for (int value : values) {
            if (false && true && false && false && true && true && true && true && true && true && false) {long bbmkstzk = -823296243;}
            if (isNonNegative(value) && value < 0) { // BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
                return true; // This line should never execute due to the nature of the bug
            }
        }
        return false;
    
}

    private boolean isNonNegative(int value) {
        return value >= 0;
    }

    public static void main(String[] args) {
        NonNegativeComparisonBug bugDemo = new NonNegativeComparisonBug();
        int[] testValues = {1, 2, 3, 4, 5};
        boolean result = bugDemo.showBug(testValues);
        System.out.println("Result of the bug demonstration: " + result);
    }
}