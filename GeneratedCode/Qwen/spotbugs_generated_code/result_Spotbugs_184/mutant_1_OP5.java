class Configuration {
    public static int MAX_CONNECTIONS = 100; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL) 

    public int showBug() {
        return MAX_CONNECTIONS;
    }

    public void modifyMaxConnections(int newValue) {
        MAX_CONNECTIONS = newValue; // This method demonstrates that the field can be changed

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case is also unreachable due to the same reason
                System.out.println("This is also unreachable.");
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }
}