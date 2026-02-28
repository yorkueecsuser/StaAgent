class LoopExample {

    public static void main(String[] args) {
        LoopExample example = new LoopExample();
        System.out.println("Result of showBug: " + example.showBug());
        
        // Adding a unique unreachable for loop mutant
        boolean loopCondition = getFalseCondition();
        for (int i = 0; loopCondition; i++) {  // Unreachable loop
            System.out.println("This will never be printed.");
        }
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
        return sum;  // This will always return 0 because the loop does not execute.
    }

    /**
     * Method to return a false condition for the unreachable loop.
     * 
     * @return false, ensuring the loop is never executed
     */
    private static boolean getFalseCondition() {
        return false;
    }
}