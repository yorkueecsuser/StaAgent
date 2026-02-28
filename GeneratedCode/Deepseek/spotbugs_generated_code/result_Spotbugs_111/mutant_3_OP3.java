class DeadParameterBug {
    public int showBug(int input) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block will never be executed because the condition is always false
            input = 5; // Add an unnecessary assignment to simulate another operation
        }

        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}