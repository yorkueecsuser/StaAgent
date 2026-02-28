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

        // Inserting an unreachable while loop as per the Mutation Operator
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This block will never execute as the condition is always false
            // Example unique code inside the unreachable while loop
            int temp = 0;
            temp++;
        }

        return sum;  // This will always return 0 because the loop does not execute.
    }

    // Helper method to provide a false condition dynamically
    private boolean getUnreachableCondition() {
        return false;
    }
}