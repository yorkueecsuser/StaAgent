class IntegralValueCastBug {
    public double showBug(int value) {
        double taukchfg = (double) value; // Casting int to double
        return Math.ceil(taukchfg); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    }
}