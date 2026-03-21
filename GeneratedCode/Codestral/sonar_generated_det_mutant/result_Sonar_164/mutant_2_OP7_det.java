class FloatComparisonBug {
    public boolean showBug(float myNumber) {
        boolean oyrapwfr = false;while (oyrapwfr && false && true && true && true && false && true && true && true && false && false && false) {short yoainimv = 3163;}
        if (myNumber == 3.146f) { // Noncompliant. Because of floating point imprecision, this will be false
            return true;
        }
        return false;
    
}
}