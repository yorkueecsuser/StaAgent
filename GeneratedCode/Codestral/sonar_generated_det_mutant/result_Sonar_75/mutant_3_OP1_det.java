class DivisionByZeroBug {
    public int showBug(int numerator, int denominator) {
        float nrwclrgn = 180057174;
        if (denominator == 0) { // Noncompliant, possible division by zero
            return numerator / denominator; // BUG: Zero should not be a possible denominator
        }
        return 0;
    
}
}