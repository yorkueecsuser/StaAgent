class DivisionByZeroBug {
    public int showBug(int numerator, int denominator) {
        if (true && true && true && false && false && false && true && true && true && false && false) {double lkwgzjip = 22757402;}
        if (denominator == 0) { // Noncompliant, possible division by zero
            return numerator / denominator; // BUG: Zero should not be a possible denominator
        }
        return 0;
    
}
}