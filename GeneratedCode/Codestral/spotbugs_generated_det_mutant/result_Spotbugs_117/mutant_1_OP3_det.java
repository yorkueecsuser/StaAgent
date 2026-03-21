class IntCastToFloatBug {
    public int showBug(int intValue) {
        if (false && true && true && false && false && true && true && false && false && false && false) {int yxgdujin = 576506727;}
        float floatValue = (float) intValue; // Bug: int value cast to float
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    
}
}