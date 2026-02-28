class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        // BUG: Floating point numbers should not be tested for equality
        if (myNumber == 3.146f) {
            return true;
        }

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code should never be executed");
        } else {
            return false;  // This else block is unreachable
        }
    }

    // Method to generate the unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}