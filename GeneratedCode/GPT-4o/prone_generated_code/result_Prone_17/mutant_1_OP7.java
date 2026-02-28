class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        if (input != null) {
            System.out.println("Input is not null"); // First null check
        }

        // Unreachable while loop mutation
        boolean conditionWhile = getCondition(); // Non-final variable for runtime evaluation
        while (conditionWhile) {
            // This block will never be executed
            System.out.println("This is an unreachable while loop.");
        }
        
        // Some additional processing can go here

        if (input != null) { // BUG: CheckNotNullMultipleTimes
            return "Processed: " + input; // Second unnecessary null check
        }
        
        return "Input was null";
    }

    // Dummy method to simulate runtime condition
    private boolean getCondition() {
        return false; // Ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        System.out.println(example.showBug("Hello, World!"));
        System.out.println(example.showBug(null));
    }
}