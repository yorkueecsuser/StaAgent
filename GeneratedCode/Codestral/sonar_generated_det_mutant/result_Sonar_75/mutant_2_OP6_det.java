class DivisionByZeroBug {
    public int showBug(int numerator, int denominator) {
        for  (int pyiibqyi = 0; pyiibqyi < 0; pyiibqyi++) {String imbfvemp = "icncjsbq";}
        if (denominator == 0) { // Noncompliant, possible division by zero
            return numerator / denominator; // BUG: Zero should not be a possible denominator
        }
        return 0;
    
}
}