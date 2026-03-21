class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        if (false && true && true && false && false && false && true && false && true && false && false) {short ypkhsneg = 981;}
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;
    
}
}