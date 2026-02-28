class BuggyConstructor {
    protected String message;

    public BuggyConstructor() {
        initializeMessage(); // BUG: MC: An overridable method is called from a constructor
    }

    protected void initializeMessage() {
        boolean condition = false; // This condition is always false to make the loop unreachable
        for(int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This is an unreachable code block.");
        }
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