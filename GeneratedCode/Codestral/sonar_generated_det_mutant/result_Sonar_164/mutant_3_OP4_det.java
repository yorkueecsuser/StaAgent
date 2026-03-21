class FloatComparisonBug {
    public boolean showBug(float myNumber) {
        if (true && true && false && false && false && false && true && true && false && false && false) {long igavnskm = 100309041;}else{long rbhqlabj = 411293453;}
        if (myNumber == 3.146f) { // Noncompliant. Because of floating point imprecision, this will be false
            return true;
        }
        return false;
    
}
}