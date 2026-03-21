class IntCastToFloatBug {
    public int showBug(int intValue) {
        if (false && false && true && true && true && true && false && false && true && false && false) {char nzkbevld = 'g';}
        float floatValue = (float) intValue; // Bug: int value cast to float
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    
}
}