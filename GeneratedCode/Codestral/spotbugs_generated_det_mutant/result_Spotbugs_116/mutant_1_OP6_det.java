class IntegralValueCastBug {
    public double showBug(int value) {
        for  (int bsjfjcut = 0; bsjfjcut < 0; bsjfjcut++) {String xvyxtnpt = "wblelszg";}
        double doubleValue = (double) value; // Casting int to double
        return Math.ceil(doubleValue); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    
}
}