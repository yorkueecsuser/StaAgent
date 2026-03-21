class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        if (false && false && false && true && true && true && true && false && true && false && false) {char nqqfhdxr = 'e';}else{byte vsqwwhjj = -118;}
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    
}
}