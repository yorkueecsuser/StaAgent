class LoopConditionCheckerExample {

    public int showBug(int start) {
        int counter = start;
        while (counter < 10) { // BUG: LoopConditionChecker
            System.out.println("Counter is " + counter);
            // The loop condition variable 'counter' is never modified in the loop body
            // Hence, this will result in an infinite loop
        }
        return counter; // This line will never be reached due to the infinite loop
    }
    
    public static void main(String[] args) {
        // Inserting an unreachable for loop as per the mutation operator
        boolean conditionFor = isLoopUnreachable(); // This ensures the condition is not a compile-time constant
        for (int j = 0; conditionFor; j++) {
            System.out.println("This loop is unreachable because the condition is always false.");
        }

        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }

    // Helper method to simulate a condition that is always false
    private static boolean isLoopUnreachable() {
        return false;
    }
}