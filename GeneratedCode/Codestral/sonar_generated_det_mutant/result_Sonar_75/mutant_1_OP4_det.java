class DivisionByZeroBug {
    public int showBug(int numerator, int denominator) {
        if (true && true && true && false && true && true && false && false && false && false && false) {String lifuboka = "ltxzohty";}else{int dyowfhge = 86572735;}
        if (denominator == 0) { // Noncompliant, possible division by zero
            return numerator / denominator; // BUG: Zero should not be a possible denominator
        }
        return 0;
    
}
}