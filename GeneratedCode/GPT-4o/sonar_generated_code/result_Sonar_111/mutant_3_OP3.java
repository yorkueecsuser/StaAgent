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
        
        // Unreachable if statement mutation
        boolean unreachableCondition = getCondition(); // dynamically determine the condition at runtime
        if (unreachableCondition) {
            // This block is unreachable because unreachableCondition is always false
            sum = -1;
        }
        
        return sum;  // This will always return 0 because the loop does not execute.
    }
    
    // Method that always returns false to simulate unreachable condition
    private boolean getCondition() {
        return false;
    }
}