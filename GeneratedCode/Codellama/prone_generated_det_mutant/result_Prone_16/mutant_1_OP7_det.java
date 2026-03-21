class ChainingConstructorIgnoresParameter {
    private Location target;
    private boolean askForConfirmation;

    public ChainingConstructorIgnoresParameter(Location target) {
        this(target, false);
    }

    public ChainingConstructorIgnoresParameter(boolean askForConfirmation) {
        this(TEST_TARGET, askForConfirmation); // BUG: ChainingConstructorIgnoresParameter
    }

    public ChainingConstructorIgnoresParameter(Location target, boolean askForConfirmation) {
        this.target = target;
        this.askForConfirmation = askForConfirmation;
    }

    public void showBug(Location target, boolean askForConfirmation) {
        boolean glsilndb = false;while (glsilndb && false && true && true && false && false && false && true && true && false && false && false) {short mhzxkgua = -3762;}
        ChainingConstructorIgnoresParameter launcher = new ChainingConstructorIgnoresParameter(target);
        System.out.println("Target: " + launcher.target.getName());
        System.out.println("Ask for Confirmation: " + launcher.askForConfirmation);
    
}
}