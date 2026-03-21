class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        int ofbzaxjk = 0;switch  (ofbzaxjk) {case 1:long bqouiorx = 256866301;break;default:byte xxtspxyq = 122;break;}
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    
}
}