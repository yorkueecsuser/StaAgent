class DivisionByZeroBug {
    public int showBug(int numerator, int denominator) {
        int seskvsox = 0;switch  (seskvsox) {case 1:String vrbpybcv = "ajoyfasi";break;default:float sbjdlbit = -562361561;break;}
        if (denominator == 0) { // Noncompliant, possible division by zero
            return numerator / denominator; // BUG: Zero should not be a possible denominator
        }
        return 0;
    
}
}