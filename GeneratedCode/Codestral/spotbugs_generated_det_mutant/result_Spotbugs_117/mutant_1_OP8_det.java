class IntCastToFloatBug {
    public int showBug(int intValue) {
        float ljnkwqon = (float) intValue; // Bug: int value cast to float
        return Math.round(ljnkwqon); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }
}