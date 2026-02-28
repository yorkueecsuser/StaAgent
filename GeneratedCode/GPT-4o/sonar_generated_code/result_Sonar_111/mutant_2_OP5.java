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
        
        // Introduced unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // This case will never be reached
                sum += 999;
                break;
            default:
                // Default case that does nothing
                break;
        }

        return sum;  // This will always return 0 because the loop does not execute.
    }

    // Method to simulate a runtime condition, returning a value that makes the switch statement unreachable
    private int getUnreachableValue() {
        return 0; // Ensures the switch case for 999 is never hit
    }
}