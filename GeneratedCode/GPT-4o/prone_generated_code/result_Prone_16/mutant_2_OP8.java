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
        return "Target: " + launcher.target + ", Ask For Confirmation: " + launcher.askForConfirmation;
    }

    public static void main(String[] args) {
        MissileLauncher ml = new MissileLauncher("Custom Target");
        System.out.println(ml.showBug(true));
    }

    // Mutant Code
    private static final String t = "DEFAULT_TARGET";
    private String t1;
    private boolean b1;

    public MissileLauncher(String t1) {
        this(t1, false);
    }

    public MissileLauncher(boolean b1) {
        this(t, false);
    }

    public MissileLauncher(String t1, boolean b1) {
        this.t1 = t1;
        this.b1 = b1;
    }

    public String showBugRenamed(boolean b1) {
        MissileLauncher launcher = new MissileLauncher(b1);
        return "Target: " + launcher.t1 + ", Ask For Confirmation: " + launcher.b1;
    }

    public static void mainRenamed(String[] args) {
        MissileLauncher ml = new MissileLauncher("Custom Target");
        System.out.println(ml.showBugRenamed(true));
    }
}