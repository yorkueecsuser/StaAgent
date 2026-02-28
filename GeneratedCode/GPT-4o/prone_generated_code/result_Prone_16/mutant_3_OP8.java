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
}

// Mutated Code with Renaming Operator
class MutantMissileLauncher {
    private static final String TEST_TARGET = "DEFAULT_TARGET";
    private String a; // Renamed from 'target'
    private boolean b; // Renamed from 'askForConfirmation'

    public MutantMissileLauncher(String a) {
        this(a, false);
    }

    public MutantMissileLauncher(boolean b) {
        this(TEST_TARGET, false); // BUG: ChainingConstructorIgnoresParameter
    }

    public MutantMissileLauncher(String a, boolean b) {
        this.a = a;
        this.b = b;
    }

    public String showBug(boolean b) {
        MutantMissileLauncher launcher = new MutantMissileLauncher(b);
        return "Target: " + launcher.a + ", Ask For Confirmation: " + launcher.b;
    }

    public static void main(String[] args) {
        MutantMissileLauncher ml = new MutantMissileLauncher("Custom Target");
        System.out.println(ml.showBug(true));
    }
}