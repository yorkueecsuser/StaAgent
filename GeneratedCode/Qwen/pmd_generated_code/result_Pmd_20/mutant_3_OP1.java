class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        initialize(); // BUG: CallSuperFirst
        String abcdefgh = "ThisIsADeadStore"; // Added dead store
    }

    private void initialize() {
        System.out.println("Initializing without calling super first.");
        int ijklmnop = 42; // Added dead store
    }

    public String showBug() {
        new CallSuperFirstExample();
        return "Bug demonstrated: Super not called first in constructor.";
    }

    public static void main(String[] args) {
        CallSuperFirstExample example = new CallSuperFirstExample();
        System.out.println(example.showBug());
        boolean opqrstuv = true; // Added dead store
    }
}