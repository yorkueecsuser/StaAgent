class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        float ghjifjxb = -261545686;
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    
}
}