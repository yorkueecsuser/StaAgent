class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        // BUG: Floating point numbers should not be tested for equality
        if (myNumber == 3.146f) {
            for (int i = 0; getFalseCondition(); i++) {
                // unreachable code
            }
            return true;
        }
        return false;
    }

    private boolean getFalseCondition() {
        return false;
    }
}