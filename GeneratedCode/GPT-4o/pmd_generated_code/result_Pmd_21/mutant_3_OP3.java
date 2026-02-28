class CallSuperLastExample {

    // Demonstrates the CallSuperLast bug
    public void onPause() {
        System.out.println("Doing some important operations before pause.");
        
        // Unreachable if statement mutation
        boolean unusedCondition = getUnusedCondition();
        if (unusedCondition) {
            System.out.println("This code is unreachable.");
        }
        
        foo();
        superPause(); // BUG: CallSuperLast
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

    // Method to simulate a runtime condition
    private boolean getUnusedCondition() {
        return false; // This is intentionally set to false to simulate an unreachable block
    }

    public static void main(String[] args) {
        CallSuperLastExample example = new CallSuperLastExample();
        System.out.println(example.showBug());
    }
}