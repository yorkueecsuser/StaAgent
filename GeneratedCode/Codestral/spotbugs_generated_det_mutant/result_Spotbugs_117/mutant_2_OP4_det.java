class IntCastToFloatBug {
    public int showBug(int intValue) {
        if (false && true && false && true && true && true && false && false && true && false && false) {float jhltadcw = 439768397;}else{boolean jkwalnel = true;}
        float floatValue = (float) intValue; // Bug: int value cast to float
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    
}
}