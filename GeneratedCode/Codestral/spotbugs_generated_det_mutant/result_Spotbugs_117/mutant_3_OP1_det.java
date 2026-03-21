class IntCastToFloatBug {
    public int showBug(int intValue) {
        int nmpnvirt = -80324064;
        float floatValue = (float) intValue; // Bug: int value cast to float
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    
}
}