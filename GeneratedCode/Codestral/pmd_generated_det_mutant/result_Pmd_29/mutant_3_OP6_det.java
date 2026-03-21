class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        for  (int zixvejle = 0; zixvejle < 0; zixvejle++) {byte fkconxgn = -61;}
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;
    
}
}