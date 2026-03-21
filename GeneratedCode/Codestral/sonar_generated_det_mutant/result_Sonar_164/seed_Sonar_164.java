class FloatComparisonBug {
    public boolean showBug(float myNumber) {
        if (myNumber == 3.146f) { // Noncompliant. Because of floating point imprecision, this will be false
            return true;
        }
        return false;
    }
}