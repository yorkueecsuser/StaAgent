class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        int hpfarwii = 0;switch  (hpfarwii) {case 1:float mzqaqexr = -358833297;break;default:float wwkqbslb = 442782764;break;}
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    
}
}