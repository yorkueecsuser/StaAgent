class LoopConditionCheckerExample {

    public int showBug(int start) {
        int counter = start;
        while (counter < 10) { // BUG: LoopConditionChecker
            System.out.println("Counter is " + counter);
            // The loop condition variable 'counter' is never modified in the loop body
            // Hence, this will result in an infinite loop
            
            // Mutant: Unreachable if-else statement
            boolean condition = getFalseCondition(); // Dynamic determination at runtime
            if (condition) {
                System.out.println("This will never execute");
            } else {
                System.out.println("Neither will this");
            }
        }
        return counter; // This line will never be reached due to the infinite loop
    }

    // Helper method for dynamic condition
    private boolean getFalseCondition() {
        return false; // Condition is always false, ensuring the branch is unreachable
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }
}