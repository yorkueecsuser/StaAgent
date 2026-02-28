class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // This block is reachable if shouldRun is true
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable if shouldRun is false
            System.out.println("This is an unreachable block due to the condition.");
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

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This ensures the else block is technically unreachable, but the condition is not a compile-time constant
    }
}