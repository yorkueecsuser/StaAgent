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

    private boolean unreachableCondition() {
        return false;
    }
    
    public void unreachableLoopExample() {
        boolean conditionWhile = unreachableCondition();
        while (conditionWhile) {
            System.out.println("This loop is unreachable");
        }
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
        example.unreachableLoopExample();
    }
}