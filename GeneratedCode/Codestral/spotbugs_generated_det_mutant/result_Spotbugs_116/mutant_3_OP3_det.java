class IntegralValueCastBug {
    public double showBug(int value) {
        if (true && true && false && false && false && false && true && true && false && true && false) {char zbcsapcx = 'n';}
        double doubleValue = (double) value; // Casting int to double
        return Math.ceil(doubleValue); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    
}
}