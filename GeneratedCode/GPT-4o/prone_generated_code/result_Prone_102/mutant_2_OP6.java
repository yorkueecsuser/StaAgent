class LoopConditionCheckerExample {

    public int showBug(int start) {
        int counter = start;
        while (counter < 10) { // BUG: LoopConditionChecker
            System.out.println("Counter is " + counter);
            // The loop condition variable 'counter' is never modified in the loop body
            // Hence, this will result in an infinite loop
        }
        
        // Mutation: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // This loop is unreachable because conditionFor is false
            System.out.println("This is an unreachable loop iteration " + i);
        }

        return counter; // This line will never be reached due to the infinite loop
    }

    private boolean getCondition() {
        return false; // conditionFor will always be false, making the for loop unreachable
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }
}