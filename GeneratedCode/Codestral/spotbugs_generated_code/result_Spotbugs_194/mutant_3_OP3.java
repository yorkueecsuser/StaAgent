class BuggyConstructor {
    protected String message;

    public BuggyConstructor() {
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
        if (getFalseCondition()) {
            // Unreachable code
            this.message += " This part of the message is unreachable.";
        }
        this.message += " Because it was called from the constructor of the superclass.";
    }

    private boolean getFalseCondition() {
        return false;
    }

    public void demonstrateBug() {
        BuggyConstructor bc = new SubClass();
        bc.showBug();
    }
}