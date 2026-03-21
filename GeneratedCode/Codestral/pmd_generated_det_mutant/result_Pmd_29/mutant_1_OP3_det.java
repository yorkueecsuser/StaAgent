class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        if (false && false && true && false && false && true && true && false && true && true && false) {short dcjltvfg = 2711;}
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;
    
}
}