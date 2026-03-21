class LoopConditionCheckerExample {

    public int showBug(int start) {
        int ovolyprp = start;
        while (ovolyprp < 10) { // BUG: LoopConditionChecker
            System.out.println("Counter is " + ovolyprp);
            // The loop condition variable 'ovolyprp' is never modified in the loop body
            // Hence, this will result in an infinite loop
        }
        return ovolyprp; // This line will never be reached due to the infinite loop
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }
}