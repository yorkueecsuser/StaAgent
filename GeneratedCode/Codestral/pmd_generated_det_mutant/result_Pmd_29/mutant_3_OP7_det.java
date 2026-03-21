class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        boolean sbupchxw = false;while (sbupchxw && true && false && false && true && false && false && false && false && false && false && false) {byte stmtbxac = 97;}
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;
    
}
}