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

// Mutant code starts here
class MissileLauncherMutant {
    private static final String c = "DEFAULT_TARGET"; // Renamed TEST_TARGET to 'c'
    private String d; // Renamed 'target' to 'd'
    private boolean e; // Renamed 'askForConfirmation' to 'e'

    public MissileLauncherMutant(String d) { // Renamed 'target' to 'd'
        this(d, false);
    }

    public MissileLauncherMutant(boolean e) { // Renamed 'askForConfirmation' to 'e'
        this(c, false); // Renamed TEST_TARGET to 'c'
    }

    public MissileLauncherMutant(String d, boolean e) { // Renamed 'target' to 'd' and 'askForConfirmation' to 'e'
        this.d = d; // Renamed 'target' to 'd'
        this.e = e; // Renamed 'askForConfirmation' to 'e'
    }

    public String showBug(boolean e) { // Renamed 'askForConfirmation' to 'e'
        MissileLauncherMutant launcher = new MissileLauncherMutant(e); // Renamed 'askForConfirmation' to 'e'
        return "Target: " + launcher.d + ", Ask For Confirmation: " + launcher.e; // Renamed 'target' to 'd' and 'askForConfirmation' to 'e'
    }

    public static void main(String[] args) {
        MissileLauncherMutant ml = new MissileLauncherMutant("Custom Target");
        System.out.println(ml.showBug(true));
    }
}
// Mutant code ends here