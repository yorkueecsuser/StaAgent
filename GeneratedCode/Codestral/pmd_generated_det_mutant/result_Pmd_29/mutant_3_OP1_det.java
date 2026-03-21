class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        float ievdxmyt = -952262534;
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;
    
}
}