class IntCastToFloatBug {
    public int showBug(int intValue) {
        float floatValue = (float) intValue; // Bug: int value cast to float

        // If a loop were present, it could have been replaced with an equivalent do-while loop as follows:
        // do {
        //     // The loop body goes here
        // } while (loop condition);

        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }
}