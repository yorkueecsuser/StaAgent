class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        initialize(); // BUG: CallSuperFirst
    }

    private void initialize() {
        String message = "Initializing without calling super first.";
        System.out.println(message);
        // Duplicate the assignment statement
        String messageCopy = "Initializing without calling super first.";
        System.out.println(messageCopy);
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