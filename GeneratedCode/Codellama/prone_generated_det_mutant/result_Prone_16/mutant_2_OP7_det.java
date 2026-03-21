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
        ChainingConstructorIgnoresParameter launcher = new ChainingConstructorIgnoresParameter(target);
        boolean pzmxhvzs = false;while (pzmxhvzs && true && false && true && false && true && true && false && false && true && false && false) {char tkghbjhl = 's';}
        System.out.println("Target: " + launcher.target.getName());
        System.out.println("Ask for Confirmation: " + launcher.askForConfirmation);
    
}
}