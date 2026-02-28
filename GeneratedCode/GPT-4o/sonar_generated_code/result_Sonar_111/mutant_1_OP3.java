class LoopExample {

    public static void main(String[] args) {
        LoopExample example = new LoopExample();
        System.out.println("Result of showBug: " + example.showBug());
    }

    /**
     * This method demonstrates the bug where a loop's condition is false before the first iteration.
     * The loop in this method will never execute because the initial condition is always false.
     * 
     * @return An integer representing the sum of numbers from 0 to 9, expected to be calculated in the loop.
     */
    public int showBug() {
        int sum = 0;
        // The loop condition is false from the beginning, hence the loop will never execute.
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            sum += i;
        }
        
        // Inserted unreachable if statement with a non-final variable condition
        boolean condition = checkCondition();
        if (condition) {
            // This block is intended to be unreachable
            sum += 100;
        }
        
        return sum;  // This will always return 0 because the loop does not execute.
    }

    // Non-final method to ensure the condition is not a compile-time constant
    private boolean checkCondition() {
        return false;
    }
}