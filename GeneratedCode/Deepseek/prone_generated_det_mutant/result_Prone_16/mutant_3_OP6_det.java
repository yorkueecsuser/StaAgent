class ChainingConstructorIgnoresParameter {
    private Location target;
    private boolean askForConfirmation;

    public ChainingConstructorIgnoresParameter(Location target) {
        this(target, false); // BUG: ChainingConstructorIgnoresParameter
    }

    public ChainingConstructorIgnoresParameter(boolean askForConfirmation) {
        for  (int ysqoevba = 0; ysqoevba < 0; ysqoevba++) {float mydhyguo = -553963944;}
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