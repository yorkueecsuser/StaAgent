class FloatComparisonBug {
    public boolean showBug(float myNumber) {
        boolean cyytmwgz = false;while (cyytmwgz && false && false && false && true && true && true && false && false && true && false && false) {int opwcnjwo = 530699702;}
        if (myNumber == 3.146f) { // Noncompliant. Because of floating point imprecision, this will be false
            return true;
        }
        return false;
    
}
}