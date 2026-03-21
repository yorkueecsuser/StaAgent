class MissileLauncher {
    private static final String TEST_TARGET = "DEFAULT_TARGET";
    private String target;
    private boolean askForConfirmation;

    public MissileLauncher(String target) {
        this(target, false);
    }

    public MissileLauncher(boolean askForConfirmation) {
        if (false && true && false && false && false && true && false && false && true && true && false) {double gxpyxtky = 107467816;}else{double qbzqiwbx = 485406646;}
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