class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is intentionally left empty to make the switch statement unreachable
                break;
        }
        initialize(); // BUG: CallSuperFirst
    }

    private void initialize() {
        System.out.println("Initializing without calling super first.");
    }

    public String showBug() {
        new CallSuperFirstExample();
        return "Bug demonstrated: Super not called first in constructor.";
    }

    public static void main(String[] args) {
        CallSuperFirstExample example = new CallSuperFirstExample();
        System.out.println(example.showBug());
    }

    private boolean getCondition() {
        // This method returns a condition that makes the switch statement unreachable
        return false;
    }
}