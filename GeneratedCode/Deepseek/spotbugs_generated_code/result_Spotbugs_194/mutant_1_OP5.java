class BuggyConstructor {
    protected String message;

    public BuggyConstructor() {
        initializeMessage(); // BUG: MC: An overridable method is called from a constructor (MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR)
        applyMutation(); // Mutant code added here
    }

    protected void initializeMessage() {
        this.message = "This message might be incomplete.";
    }

    public void showBug() {
        System.out.println(this.message);
    }

    private void applyMutation() {
        int value = getValue(); // a method that returns a value
        switch (value) {
            case 1:
                System.out.println("This statement is unreachable.");
                break;
            // Add more cases here if needed, but ensure they are also unreachable
        }
    }

    private int getValue() {
        return 0; // This method always returns 0 to make the switch statement unreachable
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