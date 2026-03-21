class DivisionByZeroBug {
    public int showBug(int numerator, int denominator) {
        if (false && false && true && false && true && false && true && false && false && true && false) {float agdisphn = 835216226;}
        if (denominator == 0) { // Noncompliant, possible division by zero
            return numerator / denominator; // BUG: Zero should not be a possible denominator
        }
        return 0;
    
}
}