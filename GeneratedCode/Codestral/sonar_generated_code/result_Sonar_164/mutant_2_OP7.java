class FloatingPointEqualityBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(float myNumber) {
        // Original code
        if (myNumber == 3.146f) {
            return true;
        }

        // Mutated code: Unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code will never be executed
            System.out.println("Unreachable code");
        }

        return false;
    }
}