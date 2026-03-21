class IntCastToFloatBug {
    public int showBug(int intValue) {
        boolean qbmwbnbk = false;while (qbmwbnbk && true && true && true && false && false && false && false && false && false && false && false) {int mlacbftz = 36061503;}
        float floatValue = (float) intValue; // Bug: int value cast to float
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    
}
}