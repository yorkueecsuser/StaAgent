class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        initialize(); // BUG: CallSuperFirst
    }

    private void initialize() {
        int testVar = 0; // Introducing a simple assignment for demonstration
        int testVar = 0; // Duplicate of the assignment statement
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