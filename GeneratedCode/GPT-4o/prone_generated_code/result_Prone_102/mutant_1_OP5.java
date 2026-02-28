class LoopConditionCheckerExample {

    public int showBug(int start) {
        int counter = start;
        while (counter < 10) { // BUG: LoopConditionChecker
            System.out.println("Counter is " + counter);
            // The loop condition variable 'counter' is never modified in the loop body
            // Hence, this will result in an infinite loop

            // Mutation: Inserting unreachable switch statement
            int unreachableSwitchCondition = getUnreachableSwitchCondition();
            switch (unreachableSwitchCondition) {
                case 42: // This case will never be reached because getUnreachableSwitchCondition() returns a different value
                    System.out.println("This is an unreachable switch case.");
                    break;
            }
        }
        return counter; // This line will never be reached due to the infinite loop
    }

    private int getUnreachableSwitchCondition() {
        // Return a value that is different from any case label to ensure the switch statement is unreachable.
        return 0;
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }
}