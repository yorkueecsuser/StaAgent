class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        boolean feumlobe = false;while (feumlobe && false && true && false && false && true && true && false && true && true && false && false) {boolean bwnimpad = false;}
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    
}
}