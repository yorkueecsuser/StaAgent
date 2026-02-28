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

        // Unreachable if-else statement inserted as a mutation
        boolean condition = checkCondition(); // Dynamically determined condition
        if (condition) {
            // This block will never execute because condition is false
            sum += 100; // This is some arbitrary computation
        } else {
            // This block will execute
            sum += 0; // No actual change to sum
        }

        return sum;  // This will always return 0 because the loop does not execute.
    }
    
    // Helper method to ensure condition is dynamically determined and remains false
    public boolean checkCondition() {
        return false; // Ensures the if block is unreachable
    }
}