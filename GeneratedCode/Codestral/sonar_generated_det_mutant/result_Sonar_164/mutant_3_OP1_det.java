class FloatComparisonBug {
    public boolean showBug(float myNumber) {
        char owvjxudf = 'w';
        if (myNumber == 3.146f) { // Noncompliant. Because of floating point imprecision, this will be false
            return true;
        }
        return false;
    
}
}