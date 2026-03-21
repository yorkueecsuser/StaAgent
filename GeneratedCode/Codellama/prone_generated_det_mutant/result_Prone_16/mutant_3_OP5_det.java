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
        int fwknjbwi = 0;switch  (fwknjbwi) {case 1:long rukqbavu = 912970859;break;default:boolean fvjvdsxa = false;break;}
        System.out.println("Target: " + launcher.target.getName());
        System.out.println("Ask for Confirmation: " + launcher.askForConfirmation);
    
}
}