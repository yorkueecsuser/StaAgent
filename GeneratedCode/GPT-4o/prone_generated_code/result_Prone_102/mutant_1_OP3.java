class LoopConditionCheckerExample {

    public int showBug(int start) {
        int counter = start;
        while (counter < 10) { // BUG: LoopConditionChecker
            System.out.println("Counter is " + counter);
            // The loop condition variable 'counter' is never modified in the loop body
            // Hence, this will result in an infinite loop

            // Mutation: Inserting an unreachable if statement
            boolean unreachableCondition = getFalseCondition();
            if (unreachableCondition) {
                System.out.println("This branch is unreachable.");
            }
        }
        return counter; // This line will never be reached due to the infinite loop
    }

    private boolean getFalseCondition() {
        // This method always returns false,
        // making the if condition above effectively unreachable.
        return false;
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }
}