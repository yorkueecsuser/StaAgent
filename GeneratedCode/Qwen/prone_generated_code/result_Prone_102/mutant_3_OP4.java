class LoopConditionCheckerExample {

    // Method to demonstrate the bug
    public int showBug(int limit) {
        int counter = 0;
        while (counter < limit) { // BUG: LoopConditionChecker
            System.out.println("Counter: " + counter);
            
            // Introduced unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                System.out.println("This will never be printed");
            } else {
                System.out.println("This will also never be printed");
            }
        }
        return counter;
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method always returns false, making the if-else branch unreachable
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5); // This will run indefinitely because counter is never incremented
    }
}