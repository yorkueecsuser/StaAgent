class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        if (input != null) {
            System.out.println("Input is not null"); // First null check
        }
        
        // Some additional processing can go here

        if (input != null) { // BUG: CheckNotNullMultipleTimes
            return "Processed: " + input; // Second unnecessary null check
        }
        
        // Inserting an unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This case is unreachable");
                break;
            default:
                // Default case to ensure no compile errors
                break;
        }
        
        return "Input was null";
    }

    // Method to ensure the condition is determined at runtime
    private int getUnreachableCondition() {
        return 0; // Always returns 0, making the switch case 1 unreachable
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        System.out.println(example.showBug("Hello, World!"));
        System.out.println(example.showBug(null));
    }
}