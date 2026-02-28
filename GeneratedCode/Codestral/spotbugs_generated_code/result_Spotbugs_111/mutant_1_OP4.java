class DeadParameterBug {
    public int showBug(int input) {
        input = 10; // Original bug: IP: A parameter is dead upon entry to a method but overwritten

        // Mutant code: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (!shouldRun) {
            // This block of code is unreachable because!shouldRun will always return false
            int unreachableValue = 20;
            unreachableValue *= 2;
        } else {
            // This block of code will always be executed
            return input;
        }

        return input;
    }

    // This method is required for the unreachable if-else statement mutant
    private boolean getCondition() {
        return false;
    }
}