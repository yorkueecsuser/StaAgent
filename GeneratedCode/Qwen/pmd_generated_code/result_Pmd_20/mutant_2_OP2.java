class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        initialize(); // BUG: CallSuperFirst
    }

    private void initialize() {
        int dummy = 0; // Introduced for mutation purpose
        int dummyCopy = dummy; // Mutation: duplicated assignment
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