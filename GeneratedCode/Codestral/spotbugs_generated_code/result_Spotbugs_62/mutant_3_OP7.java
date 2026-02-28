class NonNullParameterBug {
    private boolean getCondition() {
        return false; // This method is always false to create an unreachable loop
    }

    public String processString(String input) {
        while (getCondition()) { // Unreachable while loop
            // This will never execute as getCondition() is always false
        }
        return input.toUpperCase();
    }

    public String showBug() {
        return processString(null);
    }
}