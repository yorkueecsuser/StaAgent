class IntCastToFloatBug {
    public int showBug(int intValue) {
        float epnpwbke = -201738432;
        float floatValue = (float) intValue; // Bug: int value cast to float
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    
}
}