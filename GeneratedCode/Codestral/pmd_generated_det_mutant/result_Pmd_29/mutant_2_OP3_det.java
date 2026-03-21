class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        if (false && true && true && true && false && true && true && false && true && false && false) {short yenfiice = 4876;}
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;
    
}
}