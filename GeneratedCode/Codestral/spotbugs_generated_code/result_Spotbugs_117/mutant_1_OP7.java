class IntCastToFloatBug {
    public int showBug(int intValue) {
        float floatValue = (float) intValue; // Bug: int value cast to float
        boolean conditionWhile = false;
        while (conditionWhile) { // Mutant: Unreachable while loop
            System.out.println("This line will never be executed");
        }
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }

    // Helper method to avoid compile-time constant
    private boolean getCondition() {
        return false;
    }
}