class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        // Original code
        if (myNumber == 3.146f) {
            return true;
        }

        // Mutant code: Adding an unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code will never be reached
            int infiniteLoop = 1;
            infiniteLoop = infiniteLoop / 0; // This line should cause a runtime exception if the loop is ever reached
        }

        return false;
    }

    // Method to simulate a condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }
}