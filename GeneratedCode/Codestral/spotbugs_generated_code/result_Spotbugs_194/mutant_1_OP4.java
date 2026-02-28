class BuggyConstructor {
    protected String message;
    private boolean getCondition() {
        return false;
    }

    public BuggyConstructor() {
        initializeMessage();
        // Mutant: Unreachable if-else statement
        if (getCondition()) { // This condition is always false to make the branch unreachable
            System.out.println("This is an unreachable branch");
        } else {
            // This branch will never be executed due to the condition being false
            this.message = "This message should never be used.";
        }
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