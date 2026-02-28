class FloatingPointEqualityBug {
    private boolean getFalseCondition() {
        // This method will always return false to make the condition unreachable
        return false;
    }

    public boolean showBug(float myNumber) {
        // BUG: Floating point numbers should not be tested for equality
        if (myNumber == 3.146f) {
            return true;
        }
        // Mutation: Adding an unreachable if statement
        if (getFalseCondition()) {
            int x = 10;
            // This code will never be executed
        }
        return false;
    }
}