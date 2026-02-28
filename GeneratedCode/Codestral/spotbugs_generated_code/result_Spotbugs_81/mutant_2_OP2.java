class NonNegativeComparisonBug {

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;
            int negativeConstantDuplicate = negativeConstant;   // Mutated: Duplication

            if (nonNegativeValue < negativeConstant) { // BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
                return -1;
            } else {
                return 1;
            }

            // Duplicated code:
            if (nonNegativeValue < negativeConstantDuplicate) { // BUG: Still exists
                return -1;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }
}