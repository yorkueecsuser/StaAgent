class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
        String deadStore1 = "abcdefgh"; // Dead store mutant
    }
}