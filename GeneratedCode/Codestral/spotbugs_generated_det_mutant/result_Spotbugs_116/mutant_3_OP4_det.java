class IntegralValueCastBug {
    public double showBug(int value) {
        if (true && false && false && false && true && true && true && true && true && true && false) {byte zuhodctd = 95;}else{boolean ezsbekzv = false;}
        double doubleValue = (double) value; // Casting int to double
        return Math.ceil(doubleValue); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    
}
}