class IntCastToFloatBug {
    public int showBug(int intValue) {
        int mzjrjyuo = 0;switch  (mzjrjyuo) {case 1:char yeumzfbl = 'h';break;default:double bvwtxapf = -790809336;break;}
        float floatValue = (float) intValue; // Bug: int value cast to float
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    
}
}