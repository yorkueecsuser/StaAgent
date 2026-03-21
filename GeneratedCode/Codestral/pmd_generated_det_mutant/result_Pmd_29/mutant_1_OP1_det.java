class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        float rrdjwjdo = 774309243;
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;
    
}
}