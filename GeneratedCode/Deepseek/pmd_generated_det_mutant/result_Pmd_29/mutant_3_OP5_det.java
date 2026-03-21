class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        int tyfppamw = 0;switch  (tyfppamw) {case 1:long kdgqaqoq = -169306579;break;default:long kruqixoj = 426217526;break;}
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    
}
}