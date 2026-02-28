class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
        // Mutant Code
        double someDouble2 = someDouble;
        return (someDouble2 == Double.NaN);
    }
}