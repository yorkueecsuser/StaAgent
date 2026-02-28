class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        if (input != null) {
            System.out.println("Input is not null"); // First null check
            
            // Inserting unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This code is unreachable
            }
        }
        
        // Some additional processing can go here

        if (input != null) { // BUG: CheckNotNullMultipleTimes
            return "Processed: " + input; // Second unnecessary null check
        }
        
        return "Input was null";
    }
    
    private boolean getCondition() {
        return false; // Ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        System.out.println(example.showBug("Hello, World!"));
        System.out.println(example.showBug(null));
    }
}