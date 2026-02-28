class LoopConditionCheckerExample {

    // Method to demonstrate the bug
    public int showBug(int limit) {
        int counter = 0;
        while (counter < limit) { // BUG: LoopConditionChecker
            System.out.println("Counter: " + counter);
            
            // Inserting unreachable if branch
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                System.out.println("This is an unreachable statement.");
            }
        }
        return counter;
    }

    // Method to provide a condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5); // This will run indefinitely because counter is never incremented
    }
}