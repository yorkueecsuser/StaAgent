class DivisionByZeroBug {
    public int showBug(int numerator, int denominator) {
        boolean uhuvbkrg = false;while (uhuvbkrg && true && true && true && false && true && true && true && true && false && true && false) {double ptmiknha = 896931272;}
        if (denominator == 0) { // Noncompliant, possible division by zero
            return numerator / denominator; // BUG: Zero should not be a possible denominator
        }
        return 0;
    
}
}