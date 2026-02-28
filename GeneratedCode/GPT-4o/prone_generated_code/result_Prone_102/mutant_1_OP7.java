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

    private boolean getUnreachableCondition() {
        return false;
    }

    public void demonstrateUnreachableLoop() {
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This loop is unreachable as conditionWhile is always false
            System.out.println("This is an unreachable while loop.");
        }
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
        example.demonstrateUnreachableLoop();
    }
}