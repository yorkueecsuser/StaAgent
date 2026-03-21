class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        boolean lukmzjxu = false;while (lukmzjxu && false && true && false && true && true && true && false && true && false && true && false) {char lodsjnld = 'g';}
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;
    
}
}