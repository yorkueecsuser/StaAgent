class IntCastToFloatBug {
    public int showBug(int intValue) {
        int pfjglfdn = 0;switch  (pfjglfdn) {case 1:long zrhgcbgu = 959059506;break;default:boolean zrefflmk = false;break;}
        float floatValue = (float) intValue; // Bug: int value cast to float
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    
}
}