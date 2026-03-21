class FloatComparisonBug {
    public boolean showBug(float myNumber) {
        for  (int ucuzlneu = 0; ucuzlneu < 0; ucuzlneu++) {String durylflh = "ciwgrpke";}
        if (myNumber == 3.146f) { // Noncompliant. Because of floating point imprecision, this will be false
            return true;
        }
        return false;
    
}
}