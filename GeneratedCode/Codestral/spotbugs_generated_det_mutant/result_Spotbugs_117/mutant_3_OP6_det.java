class IntCastToFloatBug {
    public int showBug(int intValue) {
        for  (int xgwjqspw = 0; xgwjqspw < 0; xgwjqspw++) {boolean exdcsrhj = false;}
        float floatValue = (float) intValue; // Bug: int value cast to float
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    
}
}