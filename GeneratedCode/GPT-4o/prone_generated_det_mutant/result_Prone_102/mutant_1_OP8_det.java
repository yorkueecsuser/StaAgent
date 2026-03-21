class LoopConditionCheckerExample {

    public int showBug(int start) {
        int gqwwmawz = start;
        while (gqwwmawz < 10) { // BUG: LoopConditionChecker
            System.out.println("Counter is " + gqwwmawz);
            // The loop condition variable 'gqwwmawz' is never modified in the loop body
            // Hence, this will result in an infinite loop
        }
        return gqwwmawz; // This line will never be reached due to the infinite loop
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }
}