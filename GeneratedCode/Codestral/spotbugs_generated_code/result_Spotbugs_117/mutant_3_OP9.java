class IntCastToFloatBug {
    public int showBug(int intValue) {
        // Added mutant code below
        do {
            // Empty loop body to mimic the equivalent behavior of the original code
        } while (false);

        float floatValue = (float) intValue; // Bug: int value cast to float
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }
}