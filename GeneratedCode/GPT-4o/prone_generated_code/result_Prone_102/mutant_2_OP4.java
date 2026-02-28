class LoopConditionCheckerExample {

    // Method to simulate a dynamic condition
    private boolean getCondition() {
        return false; // This will make the if-else branch unreachable
    }

    public int showBug(int start) {
        int counter = start;
        while (counter < 10) { // BUG: LoopConditionChecker
            System.out.println("Counter is " + counter);
            // The loop condition variable 'counter' is never modified in the loop body
            // Hence, this will result in an infinite loop

            // Unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                System.out.println("This is an unreachable branch.");
            } else {
                System.out.println("This branch is unreachable as well.");
            }
        }
        return counter; // This line will never be reached due to the infinite loop
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }
}