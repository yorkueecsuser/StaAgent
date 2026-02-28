class LoopConditionCheckerExample {

    // Method to demonstrate the bug
    public int showBug(int limit) {
        int counter = 0;
        while (counter < limit) { // BUG: LoopConditionChecker
            System.out.println("Counter: " + counter);
        }
        return counter;
    }

    // Mutated method with renamed variable
    public int showBugMutated(int limit) {
        int x = 0; // Renamed 'counter' to 'x'
        while (x < limit) { // BUG: LoopConditionChecker
            System.out.println("Counter: " + x);
        }
        return x;
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5); // This will run indefinitely because counter is never incremented
        example.showBugMutated(5); // This will also run indefinitely because x is never incremented
    }
}