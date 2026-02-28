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

    // Mutant method with renamed variable
    public String showBugMutant(String a) {
        if (a != null) {
            System.out.println("Input is not null"); // First null check
        }
        
        // Some additional processing can go here

        if (a != null) { // BUG: CheckNotNullMultipleTimes
            return "Processed: " + a; // Second unnecessary null check
        }
        
        return "Input was null";
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        System.out.println(example.showBug("Hello, World!"));
        System.out.println(example.showBug(null));

        // Testing the mutant method
        System.out.println(example.showBugMutant("Hello, World!"));
        System.out.println(example.showBugMutant(null));
    }
}