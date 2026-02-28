class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        boolean condition = getCondition(); // Ensure the condition is dynamically determined
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            System.out.println("This is an unreachable if statement.");
        }
        initialize(); // BUG: CallSuperFirst
    }

    private boolean getCondition() {
        return false; // This method returns false, making the if block unreachable
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