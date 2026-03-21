class NonNegativeComparisonBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;
            boolean unreachableCondition = getUnreachableCondition();
            for(int i = 0; unreachableCondition; i++) { // Mutant: Unreachable for loop
                System.out.println("This loop is unreachable");
            }
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