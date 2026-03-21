class NonNegativeComparisonBug {

    public int showBug(int nonNegativeValue) {
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

        // Mutation Operator: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) { // Inserting unreachable if-else branch
            System.out.println("This code should never be executed.");
        } else {
            System.out.println("This is the reachable part of the code.");
        }
    }

    // Helper method to make the condition dynamically determined at runtime
    private boolean getCondition() {
        return false;
    }
}