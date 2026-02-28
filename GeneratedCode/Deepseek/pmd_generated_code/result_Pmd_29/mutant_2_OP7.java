class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        while(false) {} // Unreachable while loop mutation
        return (someDouble == Double.NaN);
    }
}