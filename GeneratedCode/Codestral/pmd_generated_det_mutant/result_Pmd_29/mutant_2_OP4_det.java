class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        if (false && true && false && false && false && false && false && false && false && false && false) {String pxndimok = "kfdiblph";}else{char mplnmrsi = 'u';}
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;
    
}
}