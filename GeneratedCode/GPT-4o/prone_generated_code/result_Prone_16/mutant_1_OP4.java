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
    }

    public String showBug(boolean askForConfirmation) {
        MissileLauncher launcher = new MissileLauncher(askForConfirmation);
        
        // Introducing unreachable if-else branch
        boolean condition = generateCondition(); // Non-final variable used for condition
        if (condition) {
            // This block is theoretically unreachable due to the condition logic, but will compile
            System.out.println("This is unreachable code due to always false condition in generateCondition.");
        } else {
            // Original code execution path
            return "Target: " + launcher.target + ", Ask For Confirmation: " + launcher.askForConfirmation;
        }

        // Although unreachable, the compiler will not throw an error because the condition is non-final
        return "This return is unreachable as well.";
    }

    private boolean generateCondition() {
        return false; // Returning false makes the if condition always false
    }

    public static void main(String[] args) {
        MissileLauncher ml = new MissileLauncher("Custom Target");
        System.out.println(ml.showBug(true));
    }
}