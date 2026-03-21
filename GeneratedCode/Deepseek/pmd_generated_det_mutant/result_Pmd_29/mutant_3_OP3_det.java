class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        if (true && true && true && true && false && true && true && false && true && true && false) {float liwluopx = -737280666;}
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    
}
}