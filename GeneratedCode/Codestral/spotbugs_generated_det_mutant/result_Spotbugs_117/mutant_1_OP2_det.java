class IntCastToFloatBug {
public int showBug(int intValue){
    float floatValue =(float)intValue;
    floatValue =(float)intValue;
    return Math.round(floatValue);
}
}