class FloatComparisonBug {
    public boolean showBug(float myNumber) {
        int gjhlscoq = 0;switch  (gjhlscoq) {case 1:int ehldqhaw = -487881208;break;default:char ujtnanrd = 'w';break;}
        if (myNumber == 3.146f) { // Noncompliant. Because of floating point imprecision, this will be false
            return true;
        }
        return false;
    
}
}