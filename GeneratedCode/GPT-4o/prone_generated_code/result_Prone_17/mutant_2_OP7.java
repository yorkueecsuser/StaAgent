class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        boolean conditionWhile = getCondition();
        
        if (input != null) {
            System.out.println("Input is not null"); // First null check
        }
        
        // Some additional processing can go here

        while (conditionWhile) {
            // Unreachable loop; the condition is always false due to the method implementation
            System.out.println("This is an unreachable while loop");
        }

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