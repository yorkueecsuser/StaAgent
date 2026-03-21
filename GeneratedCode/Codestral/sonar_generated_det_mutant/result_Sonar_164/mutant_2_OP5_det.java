class FloatComparisonBug {
    public boolean showBug(float myNumber) {
        int coweedxc = 0;switch  (coweedxc) {case 1:int rlwlsbjv = -590395994;break;default:String mvygzuqj = "uasvcrgp";break;}
        if (myNumber == 3.146f) { // Noncompliant. Because of floating point imprecision, this will be false
            return true;
        }
        return false;
    
}
}