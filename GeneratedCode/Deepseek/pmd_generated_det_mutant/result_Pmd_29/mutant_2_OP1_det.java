class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        boolean aenrbale = false;
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    
}
}