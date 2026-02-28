class BuggyConstructor {
    protected String message;

    public BuggyConstructor() {
        initializeMessage(); // BUG: MC: An overridable method is called from a constructor (MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR)
    }

    protected void initializeMessage() {
        boolean condition = false; // Always evaluates to false to make the switch statement unreachable
        int value = getValue(); // Dynamically determined at runtime

        switch (value) {
            case 1:
                if (condition) {
                    this.message = "This message might be incomplete.";
                }
                break;
            default:
                // This default case is also unreachable
                this.message = "Default message.";
                break;
        }
    }

    private int getValue() {
        return 0; // Always returns 0 to make the switch statement unreachable
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