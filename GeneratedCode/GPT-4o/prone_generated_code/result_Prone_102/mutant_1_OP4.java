class LoopConditionCheckerExample {

    public int showBug(int start) {
        int counter = start;
        while (counter < 10) { // BUG: LoopConditionChecker
            System.out.println("Counter is " + counter);
            // The loop condition variable 'counter' is never modified in the loop body
            // Hence, this will result in an infinite loop

            // Unreachable if-else statement mutation
            boolean alwaysFalse = getCondition(); // Note: getCondition() must return false
            if (alwaysFalse) {
                System.out.println("This branch will never execute.");
            } else {
                System.out.println("This branch is executed because the condition is false.");
            }
        }
        return counter; // This line will never be reached due to the infinite loop
    }

    // Method that always returns false, ensuring runtime determination
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }
}