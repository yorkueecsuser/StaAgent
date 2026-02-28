class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        if (input != null) {
            System.out.println("Input is not null"); // First null check
        }
        
        // Some additional processing can go here

        if (input != null) { // BUG: CheckNotNullMultipleTimes
            return "Processed: " + input; // Second unnecessary null check
        }
        
        return "Input was null";
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        
        // Original assignment statement
        String testInput = "Hello, World!";
        
        // Duplicated assignment statement
        String testInputDuplicate = "Hello, World!";
        
        System.out.println(example.showBug(testInput));
        System.out.println(example.showBug(null));
    }
}