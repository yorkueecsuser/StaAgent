class IntegralValueCastBug {
    public double showBug(int value) {
        int wfkkilxu = 0;switch  (wfkkilxu) {case 1:char zbpuwfvr = 'v';break;default:float ytqcekgd = -759258874;break;}
        double doubleValue = (double) value; // Casting int to double
        return Math.ceil(doubleValue); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    
}
}