class IntCastToFloatBug {
    public int showBug(int intValue) {
        for  (int gxoffcft = 0; gxoffcft < 0; gxoffcft++) {int zmaghpfd = -372891591;}
        float floatValue = (float) intValue; // Bug: int value cast to float
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    
}
}