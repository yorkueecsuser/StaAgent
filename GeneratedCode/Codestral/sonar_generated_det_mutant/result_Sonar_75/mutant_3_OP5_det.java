class DivisionByZeroBug {
    public int showBug(int numerator, int denominator) {
        int fcqczowz = 0;switch  (fcqczowz) {case 1:char ennsmxen = 'u';break;default:long vnejtlgt = -496229871;break;}
        if (denominator == 0) { // Noncompliant, possible division by zero
            return numerator / denominator; // BUG: Zero should not be a possible denominator
        }
        return 0;
    
}
}