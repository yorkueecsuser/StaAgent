class DivisionByZeroBug {
    public int showBug(int numerator, int denominator) {
        for  (int rgqeocwu = 0; rgqeocwu < 0; rgqeocwu++) {String zmyciysx = "zywbropa";}
        if (denominator == 0) { // Noncompliant, possible division by zero
            return numerator / denominator; // BUG: Zero should not be a possible denominator
        }
        return 0;
    
}
}