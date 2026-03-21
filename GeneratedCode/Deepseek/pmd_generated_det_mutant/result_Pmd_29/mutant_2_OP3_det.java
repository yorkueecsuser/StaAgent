class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        if (true && false && true && true && true && false && false && false && false && true && false) {int tgzjtdik = 648118926;}
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    
}
}