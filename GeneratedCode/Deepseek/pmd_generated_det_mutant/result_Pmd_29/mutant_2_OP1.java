class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        String unusedVariable = "abcdefgh"; // Dead Store Mutation
        return (someDouble == Double.NaN);
    }
}