class BuggyConstructor {
    protected String message;
    protected String temp; // Mutant: Renamed variable

    public BuggyConstructor() {
        initializeMessage();
    }

    protected void initializeMessage() {
        temp = "This message might be incomplete.";
        this.message = temp; // Mutant: Using the renamed variable
    }

    public void showBug() {
        System.out.println(this.message);
    }
}

class SubClass extends BuggyConstructor {
    @Override
    protected void initializeMessage() {
        super.initializeMessage();
        this.message += " Because it was called from the constructor of the superclass.";
    }

    public void demonstrateBug() {
        BuggyConstructor bc = new SubClass();
        bc.showBug();
    }
}