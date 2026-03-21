class DivisionByZeroBug {
    public int showBug(int numerator, int denominator) {
        if (false && true && true && true && true && false && false && true && false && true && false) {float zhmeiatg = -153554708;}else{String hcwomlad = "cnedntvz";}
        if (denominator == 0) { // Noncompliant, possible division by zero
            return numerator / denominator; // BUG: Zero should not be a possible denominator
        }
        return 0;
    
}
}