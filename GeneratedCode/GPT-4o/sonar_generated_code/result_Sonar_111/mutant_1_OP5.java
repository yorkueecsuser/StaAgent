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

        // Insert an unreachable switch statement by using a condition that evaluates to a value not present in the switch cases
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This case will never be reached");
                break;
            case 2:
                System.out.println("Neither will this");
                break;
            default:
                // Default case can be left empty to ensure no code execution
                break;
        }
        
        return sum;  // This will always return 0 because the loop does not execute.
    }
    
    // Method to provide a value that leads to an unreachable switch case
    private int getUnreachableCondition() {
        return 3; // This value is not part of any case, making all cases unreachable
    }
}