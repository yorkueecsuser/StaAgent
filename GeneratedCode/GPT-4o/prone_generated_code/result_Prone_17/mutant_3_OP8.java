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
        System.out.println(example.showBug("Hello, World!"));
        System.out.println(example.showBug(null));
    }
}

// Mutated code with renaming
class CheckNotNullMultipleTimesExample_mutant {

    public String showBug(String x) { // Renamed variable from input to x
        if (x != null) {
            System.out.println("Input is not null"); // First null check
        }
        
        // Some additional processing can go here

        if (x != null) { // BUG: CheckNotNullMultipleTimes
            return "Processed: " + x; // Second unnecessary null check
        }
        
        return "Input was null";
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimesExample_mutant example = new CheckNotNullMultipleTimesExample_mutant();
        System.out.println(example.showBug("Hello, World!"));
        System.out.println(example.showBug(null));
    }
}