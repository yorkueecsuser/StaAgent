class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        // BUG: Floating point numbers should not be tested for equality
        int unusedVariable = 10;   // Dead store mutation
        if (myNumber == 3.146f) {
            return true;
        }
        return false;
    }
}