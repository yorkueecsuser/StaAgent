class LoopConditionCheckerExample {

    public int showBug(int start) {
        int counter = start;
        while (counter < 10) { // BUG: LoopConditionChecker
            System.out.println("Counter is " + counter);
            // The loop condition variable 'counter' is never modified in the loop body
            // Hence, this will result in an infinite loop

            // Inserted unreachable if statement
            boolean condition = getFalseCondition();
            if (condition) {
                System.out.println("This line is unreachable");
            }
        }
        return counter; // This line will never be reached due to the infinite loop
    }

    // Method to simulate a condition that is always false
    private boolean getFalseCondition() {
        return false; // This simulates an unreachable condition
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }
}