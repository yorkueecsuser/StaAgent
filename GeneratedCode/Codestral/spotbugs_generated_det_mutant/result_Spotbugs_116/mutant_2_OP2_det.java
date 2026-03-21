class IntegralValueCastBug {
public double showBug(int value){
    double doubleValue =(double)value;
    doubleValue =(double)value;
    return Math.ceil(doubleValue);
}
}