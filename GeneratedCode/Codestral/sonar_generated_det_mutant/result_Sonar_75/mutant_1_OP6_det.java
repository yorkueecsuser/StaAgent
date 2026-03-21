class DivisionByZeroBug {
    public int showBug(int numerator, int denominator) {
        for  (int rmzwcarm = 0; rmzwcarm < 0; rmzwcarm++) {long ileynrxa = -881129611;}
        if (denominator == 0) { // Noncompliant, possible division by zero
            return numerator / denominator; // BUG: Zero should not be a possible denominator
        }
        return 0;
    
}
}