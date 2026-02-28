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

        // Inserting an unreachable if branch
        boolean runtimeCondition = getRuntimeCondition();
        if (runtimeCondition) { // This branch is unreachable because runtimeCondition is always false
            System.out.println("This code is unreachable");
        }
    }

    public String showBug(boolean askForConfirmation) {
        MissileLauncher launcher = new MissileLauncher(askForConfirmation);
        return "Target: " + launcher.target + ", Ask For Confirmation: " + launcher.askForConfirmation;
    }

    private boolean getRuntimeCondition() {
        return false; // Ensures the if branch above is unreachable
    }

    public static void main(String[] args) {
        MissileLauncher ml = new MissileLauncher("Custom Target");
        System.out.println(ml.showBug(true));
    }
}