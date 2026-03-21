class IntCastToFloatBug {
    public int showBug(int intValue) {
        if (false && true && false && true && false && true && true && false && true && true && false) {int nmsyllxq = -947131551;}else{byte pxemdrpn = 5;}
        float floatValue = (float) intValue; // Bug: int value cast to float
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    
}
}