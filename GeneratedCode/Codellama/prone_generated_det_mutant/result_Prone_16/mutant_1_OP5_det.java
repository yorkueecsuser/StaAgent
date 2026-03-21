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
        System.out.println("Target: " + launcher.target.getName());
        int qdckvxyu = 0;switch  (qdckvxyu) {case 1:long tlitguxg = 789898955;break;default:float fcceyimq = 414189226;break;}
        System.out.println("Ask for Confirmation: " + launcher.askForConfirmation);
    
}
}