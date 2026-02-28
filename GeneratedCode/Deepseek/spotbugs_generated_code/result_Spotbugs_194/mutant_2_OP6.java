class BuggyConstructor {
    protected String message;

    public BuggyConstructor() {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Mutant: Unreachable for loop
            // This loop will never execute because the condition is always false
        }
        initializeMessage();
    }

    protected void initializeMessage() {
        this.message = "This message might be incomplete.";
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