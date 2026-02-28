class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        boolean conditionFor = getCondition(); // Non-final variable for unreachable loop condition
        if (input != null) {
            System.out.println("Input is not null"); // First null check
        }
        
        // Inserting an unreachable for loop
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop iteration.");
        }

        // Some additional processing can go here

        if (input != null) { // BUG: CheckNotNullMultipleTimes
            return "Processed: " + input; // Second unnecessary null check
        }
        
        return "Input was null";
    }

    // Method to ensure the condition is dynamically determined at runtime
    private boolean getCondition() {
        return false; // This will be used to make the loop condition always false
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        System.out.println(example.showBug("Hello, World!"));
        System.out.println(example.showBug(null));
    }
}