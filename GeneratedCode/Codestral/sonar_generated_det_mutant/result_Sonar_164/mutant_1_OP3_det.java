class FloatComparisonBug {
    public boolean showBug(float myNumber) {
        if (true && true && false && true && false && false && true && true && true && true && false) {int cemxcweh = 21423384;}
        if (myNumber == 3.146f) { // Noncompliant. Because of floating point imprecision, this will be false
            return true;
        }
        return false;
    
}
}