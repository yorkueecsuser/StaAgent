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

        // Unreachable switch statement mutant
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This case is never executed.");
                break;
            default:
                // This default case is also unreachable
                System.out.println("Default case, also never executed.");
        }
    }

    public String showBug(boolean askForConfirmation) {
        MissileLauncher launcher = new MissileLauncher(askForConfirmation);
        return "Target: " + launcher.target + ", Ask For Confirmation: " + launcher.askForConfirmation;
    }

    private int getUnreachableCondition() {
        // This method returns a value that makes the switch statement unreachable
        return -1; // Ensuring no case in the switch statement is executed
    }

    public static void main(String[] args) {
        MissileLauncher ml = new MissileLauncher("Custom Target");
        System.out.println(ml.showBug(true));
    }
}