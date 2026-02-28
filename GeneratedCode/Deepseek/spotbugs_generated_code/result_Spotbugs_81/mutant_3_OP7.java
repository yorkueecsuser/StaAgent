class NonNegativeComparisonBug {

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;
            if (nonNegativeValue < negativeConstant) {
                // Mutation: Insert unreachable while loop
                boolean conditionWhile = false;
                while (conditionWhile) {
                    // This code will never be executed
                    int x = 10;
                }
                // End of mutation
                return -1;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }
}