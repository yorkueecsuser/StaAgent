class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        float rn = myNumber; // new variable name
        // BUG: Floating point numbers should not be tested for equality
        if (rn == 3.146f) {
            return true;
        }
        return false;
    }
}