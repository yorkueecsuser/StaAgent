class NonNegativeComparisonBug {

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;
            do { // Mutated: Equivalent Loop Replacement
                if (nonNegativeValue < negativeConstant) { // BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
                    return -1;
                } else {
                    return 1;
                }
            } while (false); // This do-while loop is equivalent to the if check but not to the original intent of the code
        } else {
            return 0;
        }
    }
}