class CallSuperLastExample {

    // Demonstrates the CallSuperLast bug
    public void onPause() {
        System.out.println("Doing some important operations before pause.");
        foo();
        superPause(); // BUG: CallSuperLast
        
        // Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // This method simulates a dynamic value
        switch (unreachableValue) {
            case 1:
                System.out.println("This statement is unreachable.");
                break;
            default:
                // No default action, making this switch essentially unreachable
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

    public String showBug() {
        onPause();
        return "Bug demonstrated: super method called last instead of first.";
    }

    public static void main(String[] args) {
        CallSuperLastExample example = new CallSuperLastExample();
        System.out.println(example.showBug());
    }
    
    // Simulate a method returning a value that doesn't match the case
    private int getUnreachableValue() {
        return 2; // Always return a value that doesn't match any case
    }
}