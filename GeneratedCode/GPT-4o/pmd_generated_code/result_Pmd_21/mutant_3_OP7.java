class CallSuperLastExample {

    // Demonstrates the CallSuperLast bug
    public void onPause() {
        System.out.println("Doing some important operations before pause.");
        
        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable code block.");
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

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CallSuperLastExample example = new CallSuperLastExample();
        System.out.println(example.showBug());
    }
}