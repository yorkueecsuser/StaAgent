class LoopConditionCheckerExample {

    // Method to demonstrate the bug
    public int showBug(int limit) {
        int counter = 0;
        while (counter < limit) { // BUG: LoopConditionChecker
            System.out.println("Counter: " + counter);
            
            // Unreachable if-else statement mutation
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block is intended to be unreachable
                System.out.println("This should never print");
            } else {
                // Alternative code that is also unreachable due to the nature of the condition
                System.out.println("This should also never print");
            }
        }
        return counter;
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5); // This will run indefinitely because counter is never incremented
    }
}