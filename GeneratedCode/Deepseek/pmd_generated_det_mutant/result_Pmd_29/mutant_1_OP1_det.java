class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        String uyoxmhqd = "aqppcatm";
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    
}
}