class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because getCondition() always returns false
            System.out.println("This is an unreachable if block.");
        } else {
            // This block will also never execute because the if condition is always false
            System.out.println("This is an unreachable else block.");
        }
        initialize(); // BUG: CallSuperFirst
    }

    private boolean getCondition() {
        // Always returns false to ensure the if-else block is unreachable
        return false;
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
}