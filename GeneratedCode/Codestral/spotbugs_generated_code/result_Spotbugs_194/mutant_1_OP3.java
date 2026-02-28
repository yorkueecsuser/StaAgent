class BuggyConstructor {
    protected String message;

    public BuggyConstructor() {
        if (shouldInitialize()) { // Mutation: Inserting unreachable if branch
            initializeMessage();
        }
    }

    protected void initializeMessage() {
        this.message = "This message might be incomplete.";
    }

    public void showBug() {
        System.out.println(this.message);
    }

    private boolean shouldInitialize() {
        return false; // Always false to make the if statement unreachable
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