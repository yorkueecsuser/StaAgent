class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        if (input != null) {
            System.out.println("Input is not null"); // First null check
        }
        
        // Some additional processing can go here

        if (input != null) { // BUG: CheckNotNullMultipleTimes
            return "Processed: " + input; // Second unnecessary null check
        }
        
        // Adding unreachable if-else statement
        boolean isConditionAlwaysFalse = getCondition(); // Simulate a dynamic condition
        if (isConditionAlwaysFalse) {
            System.out.println("This should never print because the condition is dynamically false");
        } else {
            System.out.println("This else branch is executed");
        }
        
        return "Input was null";
    }

    // Method to simulate a false condition
    private boolean getCondition() {
        return false; // This ensures the condition is always false dynamically
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        System.out.println(example.showBug("Hello, World!"));
        System.out.println(example.showBug(null));
    }
}