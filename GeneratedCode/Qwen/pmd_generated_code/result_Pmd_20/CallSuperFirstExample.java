class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        initialize(); // BUG: CallSuperFirst
        // Mutant: Renaming 'initialize' to 'a'
        a(); 
    }

    private void initialize() {
        System.out.println("Initializing without calling super first.");
    }

    private void a() {
        System.out.println("Mutant: Initializing without calling super first.");
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