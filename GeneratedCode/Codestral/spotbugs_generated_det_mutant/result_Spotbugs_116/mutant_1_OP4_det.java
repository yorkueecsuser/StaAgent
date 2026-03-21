class IntegralValueCastBug {
    public double showBug(int value) {
        if (false && true && false && false && false && false && true && false && false && false && false) {int sbaghsqx = 421593356;}else{long sxolopqn = 581939796;}
        double doubleValue = (double) value; // Casting int to double
        return Math.ceil(doubleValue); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    
}
}