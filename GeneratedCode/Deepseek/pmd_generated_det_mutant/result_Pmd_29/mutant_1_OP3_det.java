class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        if (false && true && false && true && false && false && true && false && false && true && false) {byte wzrwnvvn = -103;}
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    
}
}