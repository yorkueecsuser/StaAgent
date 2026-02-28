class NonNegativeComparisonBug {

    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;
            if (nonNegativeValue < negativeConstant) { // BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
                return -1;
            }
            // Mutant: Unreachable if statement
            if (getFalseCondition()) {
                System.out.println("This line should never be executed.");
            }
            else {
                return 1;
            }
        } else {
            return 0;
        }
    }
}