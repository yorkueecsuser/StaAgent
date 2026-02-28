class CallSuperLastExample {

    // Demonstrates the CallSuperLast bug
    public void onPause() {
        System.out.println("Doing some important operations before pause.");
        foo();
        superPause(); // BUG: CallSuperLast

        // Inserting unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This is unreachable code.");
        } else {
            System.out.println("This is also unreachable code.");
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

    // Helper method to simulate a dynamic condition
    private boolean getUnreachableCondition() {
        return false; // This makes the if condition always false, simulating an unreachable branch
    }
}