class Configuration {
    public static int MAX_CONNECTIONS = 100; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL) 

    public int showBug() {
        return MAX_CONNECTIONS;
    }

    public void modifyMaxConnections(int newValue) {
        MAX_CONNECTIONS = newValue; // This method demonstrates that the field can be changed

        // Mutant: Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            MAX_CONNECTIONS = 200;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }
}