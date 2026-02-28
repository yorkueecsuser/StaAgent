class Configuration {
    public static int MAX_CONNECTIONS = 100; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL) 

    public int showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable else block.");
        }
        return MAX_CONNECTIONS;
    }

    public void modifyMaxConnections(int newValue) {
        MAX_CONNECTIONS = newValue; // This method demonstrates that the field can be changed
    }

    private boolean getCondition() {
        // This method returns a condition that is dynamically determined at runtime
        return false; // Always returns false, but the condition is determined at runtime
    }
}