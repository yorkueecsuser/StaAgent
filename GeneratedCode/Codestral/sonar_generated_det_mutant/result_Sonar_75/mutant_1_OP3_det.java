class DivisionByZeroBug {
    public int showBug(int numerator, int denominator) {
        if (true && false && false && false && true && false && true && true && false && false && false) {boolean jzujvaeo = false;}
        if (denominator == 0) { // Noncompliant, possible division by zero
            return numerator / denominator; // BUG: Zero should not be a possible denominator
        }
        return 0;
    
}
}