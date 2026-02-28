class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        float x = myNumber; // Mutant: Renaming myNumber to x
        // BUG: Floating point numbers should not be tested for equality
        if (x == 3.146f) {
            return true;
        }
        return false;
    }
}