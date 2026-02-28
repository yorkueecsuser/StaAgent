class Configuration {
    public static int MAX_CONNECTIONS = 100; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL) 

    public int showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if the condition is true
        } else {
            // Unreachable code due to the condition always being false
        }
        return MAX_CONNECTIONS;
    }

    public void modifyMaxConnections(int newValue) {
        MAX_CONNECTIONS = newValue; // This method demonstrates that the field can be changed
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the else block unreachable
    }
}