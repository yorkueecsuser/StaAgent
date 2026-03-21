class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        boolean unreachableLoop = true;
        while (unreachableLoop) {
            unreachableLoop = false;
        }
        return (someDouble == Double.NaN);
    }
}