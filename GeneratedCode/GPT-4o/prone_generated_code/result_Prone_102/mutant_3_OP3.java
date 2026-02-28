class LoopConditionCheckerExample {

    public int showBug(int start) {
        int counter = start;
        while (counter < 10) { // BUG: LoopConditionChecker
            System.out.println("Counter is " + counter);
            // The loop condition variable 'counter' is never modified in the loop body
            // Hence, this will result in an infinite loop
            
            // Added unreachable if statement with dynamically determined false condition
            boolean condition = getFalseCondition();
            if (condition) {
                System.out.println("This will never execute");
            }
        }
        return counter; // This line will never be reached due to the infinite loop
    }

    // Method to return a false condition
    private boolean getFalseCondition() {
        return false; // Using a method to ensure it's a runtime determined value
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }
}