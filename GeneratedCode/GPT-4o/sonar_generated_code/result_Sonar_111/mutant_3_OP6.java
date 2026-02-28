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
        // Adding a unique unreachable for loop based on the mutation operator description
        if (shouldExecuteLoop()) {
            for (int j = 0; j < 0; j++) {  // This loop is unreachable due to its condition
                sum += j;
            }
        }
        return sum;  // This will always return 0 because neither loop executes.
    }

    private boolean shouldExecuteLoop() {
        return false; // Returning false to make the loop conditionally unreachable
    }
}