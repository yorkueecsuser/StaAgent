class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    }

    public boolean showUnreachableIfElseBug() {
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            // Unreachable code
            return false;
        } else {
            // Reachable code
            return true;
        }
    }
}