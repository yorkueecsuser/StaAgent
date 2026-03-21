class DivisionByZeroBug {
    public int showBug(int numerator, int denominator) {
        int pcyebncj = 0;switch  (pcyebncj) {case 1:int qqqqnnvk = -351450626;break;default:long fqutsqte = 857857848;break;}
        if (denominator == 0) { // Noncompliant, possible division by zero
            return numerator / denominator; // BUG: Zero should not be a possible denominator
        }
        return 0;
    
}
}