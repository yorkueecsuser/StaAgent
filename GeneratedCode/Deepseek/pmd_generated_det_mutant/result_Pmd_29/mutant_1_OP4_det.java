class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        if (true && false && false && true && true && false && false && true && false && true && false) {long krddbhqo = 980020824;}else{double hwmqebhx = 135888394;}
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    
}
}