class FloatComparisonBug {
    public boolean showBug(float myNumber) {
        int haqsornu = 0;switch  (haqsornu) {case 1:char hxpqkwcn = 'l';break;default:double gmuztpmf = -329180287;break;}
        if (myNumber == 3.146f) { // Noncompliant. Because of floating point imprecision, this will be false
            return true;
        }
        return false;
    
}
}