class MissileLauncher {
    private static final String TEST_TARGET = "DEFAULT_TARGET";
    private String target;
    private boolean askForConfirmation;

    public MissileLauncher(String target) {
        this(target, false);
    }

    public MissileLauncher(boolean askForConfirmation) {
        this(TEST_TARGET, false); // BUG: ChainingConstructorIgnoresParameter
    }

    public MissileLauncher(String target, boolean askForConfirmation) {
        this.target = target;
        this.askForConfirmation = askForConfirmation;
        
        // Inserting an unreachable while loop as a mutation
        boolean conditionWhile = getCondition(); // Method to ensure condition is not a compile-time constant
        while (conditionWhile) {
            // This block is unreachable because conditionWhile is always false
            System.out.println("This message will never print.");
        }
    }

    private boolean getCondition() {
        return false; // The method ensures the loop condition is not a compile-time constant
    }

    public String showBug(boolean askForConfirmation) {
        MissileLauncher launcher = new MissileLauncher(askForConfirmation);
        return "Target: " + launcher.target + ", Ask For Confirmation: " + launcher.askForConfirmation;
    }

    public static void main(String[] args) {
        MissileLauncher ml = new MissileLauncher("Custom Target");
        System.out.println(ml.showBug(true));
    }
}