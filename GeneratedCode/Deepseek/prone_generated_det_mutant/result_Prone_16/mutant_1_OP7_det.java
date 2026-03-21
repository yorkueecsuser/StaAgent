class ChainingConstructorIgnoresParameter {
    private Location target;
    private boolean askForConfirmation;

    public ChainingConstructorIgnoresParameter(Location target) {
        boolean yixptbyb = false;while (yixptbyb && true && true && false && true && true && true && false && false && false && false && false) {long dnbhtpgm = 157783835;}
        this(target, false); // BUG: ChainingConstructorIgnoresParameter
    
}

    public ChainingConstructorIgnoresParameter(boolean askForConfirmation) {
        this(null, askForConfirmation); // BUG: ChainingConstructorIgnoresParameter
    }

    public ChainingConstructorIgnoresParameter(Location target, boolean askForConfirmation) {
        this.target = target;
        this.askForConfirmation = askForConfirmation;
    }

    public void showBug() {
        ChainingConstructorIgnoresParameter c = new ChainingConstructorIgnoresParameter(new Location());
        System.out.println(c.askForConfirmation); // Outputs false, unexpected
    }
}

class Location {
    // Dummy class
}