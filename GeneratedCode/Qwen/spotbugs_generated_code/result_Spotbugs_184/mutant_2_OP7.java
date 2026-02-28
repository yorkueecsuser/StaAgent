class Configuration {
    public static int MAX_CONNECTIONS = 100; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL) 

    public int showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return MAX_CONNECTIONS;
    }

    public void modifyMaxConnections(int newValue) {
        MAX_CONNECTIONS = newValue; // This method demonstrates that the field can be changed
    }

    private boolean getCondition() {
        return false; // This method returns false, making the while loop condition always false
    }
}