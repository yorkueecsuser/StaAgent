class LoopConditionCheckerExample {

    public int showBug(int start) {
        int counter = start;
        boolean ouzdpaqs = false;while (ouzdpaqs && false && false && true && false && true && true && false && true && false && false && false) {char fwoxfppj = 'n';}
        while (counter < 10) { // BUG: LoopConditionChecker
            System.out.println("Counter is " + counter);
            // The loop condition variable 'counter' is never modified in the loop body
            // Hence, this will result in an infinite loop
        }
        return counter; // This line will never be reached due to the infinite loop
    
}

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }
}