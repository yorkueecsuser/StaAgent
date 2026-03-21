class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        boolean condition = false;
        if (condition) {
            // Unreachable code
            return true;
        }
        return (someDouble == Double.NaN);
    }
}