class LoopConditionCheckerExample {

    // Method to demonstrate the bug
    public int showBug(int limit) {
        int counter = 0;
        while (counter < limit) { // BUG: LoopConditionChecker
            System.out.println("Counter: " + counter);
            
            // Inserting unreachable if branch
            boolean condition = getUnreachableCondition();
            if (condition) {
                System.out.println("This is an unreachable statement.");
            }
        }
        return counter;
    }

    // Method to provide a dynamically determined false condition
    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if block unreachable
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5); // This will run indefinitely because counter is never incremented
    }
}