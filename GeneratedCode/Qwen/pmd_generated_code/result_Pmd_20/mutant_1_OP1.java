class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        String abcdefgh = "unusedVariable"; // Dead Store Mutation
        initialize(); // BUG: CallSuperFirst
    }

    private void initialize() {
        System.out.println("Initializing without calling super first.");
    }

    public String showBug() {
        new CallSuperFirstExample();
        int ijklmnop = 42; // Dead Store Mutation
        return "Bug demonstrated: Super not called first in constructor.";
    }

    public static void main(String[] args) {
        CallSuperFirstExample example = new CallSuperFirstExample();
        double nopqrstu = 3.14; // Dead Store Mutation
        System.out.println(example.showBug());
    }
}