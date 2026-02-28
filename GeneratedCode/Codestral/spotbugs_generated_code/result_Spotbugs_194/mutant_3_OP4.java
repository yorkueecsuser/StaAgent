class BuggyConstructor {
    protected String message;

    public BuggyConstructor() {
        initializeMessage(); // BUG: MC: An overridable method is called from a constructor (MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR)
    }

    protected void initializeMessage() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            this.message = "This message might be incomplete.";
        } else {
            // Unreachable branch
            System.out.println("This branch should never be executed.");
        }
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
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