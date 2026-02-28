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

        // Mutation: Inserted unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            sum += 100; // This block is unreachable
        } else {
            sum += 200; // This block is always executed
        }

        return sum;  // This will always return 200 because the loop does not execute, and the else block is always executed.
    }

    // Helper method to simulate a false condition dynamically
    private boolean getUnreachableCondition() {
        return false;
    }
}