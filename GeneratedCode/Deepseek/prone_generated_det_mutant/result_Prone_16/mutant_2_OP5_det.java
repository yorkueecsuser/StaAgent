class ChainingConstructorIgnoresParameter {
    private Location target;
    private boolean askForConfirmation;

    public ChainingConstructorIgnoresParameter(Location target) {
        this(target, false); // BUG: ChainingConstructorIgnoresParameter
    }

    public ChainingConstructorIgnoresParameter(boolean askForConfirmation) {
        int qxychkho = 0;switch  (qxychkho) {case 1:byte spendqgj = 26;break;default:double uypyewhk = 682837324;break;}
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