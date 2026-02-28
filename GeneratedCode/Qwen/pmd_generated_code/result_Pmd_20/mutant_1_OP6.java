class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("This loop is unreachable.");
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

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but returns false
    }
}