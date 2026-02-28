class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        if (input != null) {
            System.out.println("Input is not null"); // First null check
        }
        
        // Some additional processing can go here

        // Unreachable for loop using a condition that is always false at runtime
        boolean conditionFor = getCondition(); // A method to ensure condition is determined at runtime
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable for loop.");
        }

        if (input != null) { // BUG: CheckNotNullMultipleTimes
            return "Processed: " + input; // Second unnecessary null check
        }
        
        return "Input was null";
    }

    // Method to generate a false condition at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        System.out.println(example.showBug("Hello, World!"));
        System.out.println(example.showBug(null));
    }
}