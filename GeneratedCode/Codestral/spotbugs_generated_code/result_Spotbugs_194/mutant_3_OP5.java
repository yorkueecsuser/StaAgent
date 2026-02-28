class BuggyConstructor {
    protected String message;

    public BuggyConstructor() {
        initializeMessage(); // BUG: MC: An overridable method is called from a constructor (MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR)
        addUnreachableSwitch(); // Added unreachable switch statement
    }

    protected void initializeMessage() {
        this.message = "This message might be incomplete.";
    }

    public void showBug() {
        System.out.println(this.message);
    }

    private void addUnreachableSwitch() {
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                System.out.println("This line is unreachable");
                break;
        }
    }

    private int getUnreachableValue() {
        return 0; // Always returns 0, making the case in the switch statement unreachable
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