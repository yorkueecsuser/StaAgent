class DeadParameterBug {
    public int showBug(int input) {
        for (int i = 0; getCondition(); i++) { // Unreachable for loop mutant
            // This loop is unreachable because the condition is always false
        }
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    }

    private boolean getCondition() {
        return false;
    }
}