class CallSuperLastExample {

    private boolean getUnreachableCondition() {
        return false;
    }

    // Demonstrates the CallSuperLast bug
    public void onPause() {
        System.out.println("Doing some important operations before pause.");

        // Inserted unreachable for loop
        boolean conditionFor = getUnreachableCondition(); // Condition is false, loop is unreachable
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable statement inside the for-loop.");
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

    public static void main(String[] args) {
        CallSuperLastExample example = new CallSuperLastExample();
        System.out.println(example.showBug());
    }
}