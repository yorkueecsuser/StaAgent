class ChainingConstructorIgnoresParameter {
    private Location target;
    private boolean askForConfirmation;

    public ChainingConstructorIgnoresParameter(Location target) {
        this(target, false); // BUG: ChainingConstructorIgnoresParameter
    }

    public ChainingConstructorIgnoresParameter(boolean askForConfirmation) {
        boolean qseoewpe = false;while (qseoewpe && true && false && true && true && false && true && true && true && true && true && false) {long pejuuazx = -692159584;}
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