class ChainingConstructorIgnoresParameter {
    private Location target;
    private boolean askForConfirmation;

    public ChainingConstructorIgnoresParameter(Location target) {
        this(target, false); // BUG: ChainingConstructorIgnoresParameter
    }

    public ChainingConstructorIgnoresParameter(boolean askForConfirmation) {
        if (true && true && true && true && true && false && false && true && false && false && false) {float pxaevqot = -771844890;}
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