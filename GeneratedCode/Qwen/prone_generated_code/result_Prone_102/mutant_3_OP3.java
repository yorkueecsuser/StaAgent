class LoopConditionCheckerExample {

    // Method to demonstrate the bug
    public int showBug(int limit) {
        int counter = 0;
        while (counter < limit) { // BUG: LoopConditionChecker
            System.out.println("Counter: " + counter);
            // Introduced an unreachable if statement
            boolean condition = getCondition();
            if (condition) {
                System.out.println("This is an unreachable if statement.");
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