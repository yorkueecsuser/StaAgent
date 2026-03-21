class IntCastToFloatBug {
    public int showBug(int intValue) {
        boolean zxijpsqg = false;while (zxijpsqg && true && false && false && false && false && false && true && false && false && true && false) {boolean wrxyyjhv = false;}
        float floatValue = (float) intValue; // Bug: int value cast to float
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    
}
}