class IntCastToFloatBug {
    public int showBug(int intValue) {
        float floatValue = (float) intValue; // Bug: int value cast to float

        // Mutant: Unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line should never be executed.");
        }

        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }
}