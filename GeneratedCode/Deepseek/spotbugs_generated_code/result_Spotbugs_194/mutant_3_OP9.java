class BuggyConstructor {
    protected String message;

    public BuggyConstructor() {
        initializeMessage(); // BUG: MC: An overridable method is called from a constructor (MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR)

        // Hypothetical for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Equivalent do-while loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);
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