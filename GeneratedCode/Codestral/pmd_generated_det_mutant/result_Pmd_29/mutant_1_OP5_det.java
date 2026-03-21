class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        int cbynpciq = 0;switch  (cbynpciq) {case 1:long tffnjfzq = -284927754;break;default:float nigygrlw = -883604743;break;}
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;
    
}
}