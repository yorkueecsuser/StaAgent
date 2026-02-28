class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        if (input != null) {
            System.out.println("Input is not null"); // First null check
        }
        
        // Some additional processing can go here
        
        // Unreachable switch statement
        int unreachableSwitchCondition = getUnreachableCondition(); 
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This will never be executed");
                break;
            default:
                // No default action
        }

        if (input != null) { // BUG: CheckNotNullMultipleTimes
            return "Processed: " + input; // Second unnecessary null check
        }
        
        return "Input was null";
    }
    
    // Method to get the condition for the unreachable switch
    private int getUnreachableCondition() {
        return 0; // chosen value that doesn't match any case
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        System.out.println(example.showBug("Hello, World!"));
        System.out.println(example.showBug(null));
    }
}