class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        // BUG: Floating point numbers should not be tested for equality
        if (myNumber == 3.146f) {
            return true;
        }

        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable
        }

        return false;
    }

    // Method to return a false condition
    private boolean getCondition() {
        return false;
    }
}