class IntCastToFloatBug {
    public int showBug(int intValue) {
        // Adding an unreachable for loop with a false condition
        boolean condition = getFalseCondition();
        for (int i = 0; condition; i++) {
            // This loop will never be executed
        }

        float floatValue = (float) intValue; // Bug: int value cast to float
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }

    // Method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }
}