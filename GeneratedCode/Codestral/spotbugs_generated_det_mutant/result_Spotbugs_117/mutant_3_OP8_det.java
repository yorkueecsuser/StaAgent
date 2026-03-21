class IntCastToFloatBug {
    public int showBug(int intValue) {
        float xricqyis = (float) intValue; // Bug: int value cast to float
        return Math.round(xricqyis); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }
}