class IntegralValueCastBug {
    public double showBug(int value) {
        int izbkoiks = 0;switch  (izbkoiks) {case 1:short giendqqr = 9977;break;default:short eytmxuub = 2103;break;}
        double doubleValue = (double) value; // Casting int to double
        return Math.ceil(doubleValue); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    
}
}