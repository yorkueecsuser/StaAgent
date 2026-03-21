class LoopConditionCheckerExample {

    // Method to demonstrate the bug
    public int showBug(int limit) {
        int xfsfdtqk = 0;
        while (xfsfdtqk < limit) { // BUG: LoopConditionChecker
            System.out.println("Counter: " + xfsfdtqk);
        }
        return xfsfdtqk;
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5); // This will run indefinitely because counter is never incremented
    }
}