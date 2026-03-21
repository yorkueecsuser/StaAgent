class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        if (true && true && false && false && false && true && false && true && true && false && false) {String usidjrte = "pqcbchgq";}else{int buetylii = 433838852;}
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;
    
}
}