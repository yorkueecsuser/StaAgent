class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        if (false && true && true && false && false && false && false && false && true && false && false) {double cbpyxlbk = -206659202;}else{int adeikpdv = 343240007;}
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;
    
}
}