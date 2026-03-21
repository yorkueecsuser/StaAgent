class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
        // Mutant Code
        return (someDouble == Double.NaN);
    }
}