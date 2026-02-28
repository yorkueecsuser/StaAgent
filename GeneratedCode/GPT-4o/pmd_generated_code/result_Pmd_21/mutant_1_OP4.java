class CallSuperLastExample {

    // Demonstrates the CallSuperLast bug
    public void onPause() {
        System.out.println("Doing some important operations before pause.");
        
        // Added unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This part is unreachable because condition is false.");
        } else {
            System.out.println("This part will always be executed.");
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
        return false; // This will make the if condition unreachable
    }

    public static void main(String[] args) {
        CallSuperLastExample example = new CallSuperLastExample();
        System.out.println(example.showBug());
    }
}