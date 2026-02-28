class IntCastToFloatBug {
    public int showBug(int intValue) {
        float floatValue = (float) intValue; // Bug: int value cast to float
        boolean conditionFor = false; // Condition for the unreachable for loop
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This code should never be executed
            System.out.println("This is an unreachable line of code.");
        }
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }
}