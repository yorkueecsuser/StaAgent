class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        boolean shouldRun = getCondition(); // Dynamic condition to avoid unreachable code
        if (shouldRun) {
            // This block will never execute because getCondition() returns false
            System.out.println("This is an unreachable block.");
        } else {
            // Alternative block that will also never execute due to the same condition
            System.out.println("This is another unreachable block.");
        }
        initialize(); // BUG: CallSuperFirst
    }

    private boolean getCondition() {
        return false; // Method returning false to simulate the unreachable condition
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