class IntCastToFloatBug {
    public int showBug(int intValue) {
        float floatValue = (float) intValue; // Bug: int value cast to float
        boolean conditionWhile = getCondition(); // Dynamically determine the condition
        while (conditionWhile) {
            // Unreachable while loop mutant
            System.out.println("This line should never be printed.");
        }
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}