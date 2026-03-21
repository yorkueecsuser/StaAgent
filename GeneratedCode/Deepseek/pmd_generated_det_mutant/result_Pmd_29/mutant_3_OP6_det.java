class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        for  (int kzkhvaql = 0; kzkhvaql < 0; kzkhvaql++) {byte afuiacux = -25;}
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    
}
}