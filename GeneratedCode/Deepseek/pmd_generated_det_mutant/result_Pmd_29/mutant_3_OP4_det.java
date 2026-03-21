class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        if (false && false && false && false && true && true && true && false && false && true && false) {boolean gnzlaqga = false;}else{String uenxuyiw = "ajpjhknl";}
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    
}
}