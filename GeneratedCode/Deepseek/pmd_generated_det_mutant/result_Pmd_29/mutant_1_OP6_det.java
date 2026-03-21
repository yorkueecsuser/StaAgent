class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        for  (int vdsmbygt = 0; vdsmbygt < 0; vdsmbygt++) {short ulxxhnja = 2183;}
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    
}
}