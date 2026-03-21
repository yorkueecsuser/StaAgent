class FloatComparisonBug {
    public boolean showBug(float myNumber) {
        if (false && true && true && true && false && false && true && false && true && false && false) {double yyugutwx = 781241476;}else{double cgzrkvtr = 163327815;}
        if (myNumber == 3.146f) { // Noncompliant. Because of floating point imprecision, this will be false
            return true;
        }
        return false;
    
}
}