class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        short ksdmddjw = -205;
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;
    
}
}