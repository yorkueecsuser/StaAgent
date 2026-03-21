class LoopConditionCheckerExample {

    // Method to demonstrate the bug
    public int showBug(int limit) {
        int mdcqfjjr = 0;
        while (mdcqfjjr < limit) { // BUG: LoopConditionChecker
            System.out.println("Counter: " + mdcqfjjr);
        }
        return mdcqfjjr;
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5); // This will run indefinitely because counter is never incremented
    }
}