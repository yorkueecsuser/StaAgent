class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        if(false) {
            return (someDouble == Double.NaN);
        }
        return false;
    }
}