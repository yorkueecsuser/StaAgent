class CheckNotNullMultipleTimesExample {
    
    private boolean isConditionMet() {
        return false; // This method always returns false
    }

    public String showBug(String input) {
        if (input != null) {
            System.out.println("Input is not null"); // First null check
        }
        
        // Some additional processing can go here

        boolean condition = isConditionMet();
        if (condition) {
            System.out.println("This will never be printed because condition is false.");
        } else {
            System.out.println("This is always executed because condition is false.");
        }

        if (input != null) { // BUG: CheckNotNullMultipleTimes
            return "Processed: " + input; // Second unnecessary null check
        }
        
        return "Input was null";
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        System.out.println(example.showBug("Hello, World!"));
        System.out.println(example.showBug(null));
    }
}