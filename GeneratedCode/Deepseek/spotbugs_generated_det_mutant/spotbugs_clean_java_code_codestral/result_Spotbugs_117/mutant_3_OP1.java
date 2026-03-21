class IntCastToFloatBug {
    public int showBug(int intValue) {
        float floatValue = (float) intValue; // Original bug: int value cast to float
        float deadStore = 0.0f; // Dead store: unused float variable
        return Math.round(floatValue); // Original bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }
}