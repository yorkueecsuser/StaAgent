class FloatComparisonBug {
    public boolean showBug(float myNumber) {
        if (false && false && false && true && false && false && true && false && true && true && false) {short yrzwsxnd = 2870;}
        if (myNumber == 3.146f) { // Noncompliant. Because of floating point imprecision, this will be false
            return true;
        }
        return false;
    
}
}