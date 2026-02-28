class NonNegativeComparisonBug {

    public int showBug(int nonNegativeValue) {
        int deadStoreVariable; // Mutated code: Introducing a dead store variable
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;
            if (nonNegativeValue < negativeConstant) { // BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
                return -1;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }
}