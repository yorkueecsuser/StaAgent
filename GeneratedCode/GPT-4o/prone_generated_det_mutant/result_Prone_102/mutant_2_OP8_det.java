class LoopConditionCheckerExample {

    public int showBug(int start) {
        int jlklepro = start;
        while (jlklepro < 10) { // BUG: LoopConditionChecker
            System.out.println("Counter is " + jlklepro);
            // The loop condition variable 'jlklepro' is never modified in the loop body
            // Hence, this will result in an infinite loop
        }
        return jlklepro; // This line will never be reached due to the infinite loop
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }
}