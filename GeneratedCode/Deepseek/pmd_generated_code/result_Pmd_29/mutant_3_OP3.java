class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // Mutation: Unreachable if statement
        if (false) { // unreachable if statement
            return (someDouble == Double.NaN);
        }
        return false; // a unique branch to avoid unreachable statement
    }
}