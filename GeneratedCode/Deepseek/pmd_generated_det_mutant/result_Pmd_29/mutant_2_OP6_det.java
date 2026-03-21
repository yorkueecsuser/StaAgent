class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        for  (int tdrjqjom = 0; tdrjqjom < 0; tdrjqjom++) {int yxsfyudo = -80253312;}
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    
}
}