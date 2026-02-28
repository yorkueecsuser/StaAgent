class CallSuperLastExample {

    // Demonstrates the CallSuperLast bug
    public void onPause() {
        System.out.println("Doing some important operations before pause.");
        foo();
        superPause(); // BUG: CallSuperLast

        // Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 9999: // This case will never be hit
                System.out.println("This is an unreachable case.");
                break;
            default:
                break;
        }
    }
    
    private void foo() {
        System.out.println("foo method execution.");
    }
    
    // Simulating a super call
    private void superPause() {
        System.out.println("Super onPause called.");
    }

    // Method to ensure that the switch statement remains unreachable
    private int getUnreachableValue() {
        return 0; // Always returns a value that does not match case 9999
    }

    public String showBug() {
        onPause();
        return "Bug demonstrated: super method called last instead of first.";
    }

    public static void main(String[] args) {
        CallSuperLastExample example = new CallSuperLastExample();
        System.out.println(example.showBug());
    }
}