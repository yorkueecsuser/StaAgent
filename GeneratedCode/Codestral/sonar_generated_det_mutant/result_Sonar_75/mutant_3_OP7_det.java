class DivisionByZeroBug {
    public int showBug(int numerator, int denominator) {
        boolean bemrgogp = false;while (bemrgogp && true && true && true && true && false && true && false && false && true && false && false) {short qtlmspzi = -6428;}
        if (denominator == 0) { // Noncompliant, possible division by zero
            return numerator / denominator; // BUG: Zero should not be a possible denominator
        }
        return 0;
    
}
}