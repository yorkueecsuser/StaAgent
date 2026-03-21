class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // Mutated code 
        boolean condition = false;
        if (condition) {
            return (someDouble == Double.NaN);
        }
        // Original code
        return (someDouble == Double.NaN);
    }
}