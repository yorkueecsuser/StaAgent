class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        for  (int leypnqxo = 0; leypnqxo < 0; leypnqxo++) {char qyzdgjmv = 'n';}
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;
    
}
}