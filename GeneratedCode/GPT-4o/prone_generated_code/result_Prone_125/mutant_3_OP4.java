import java.util.Optional;

class OptionalMapBugExample {

    public String showBug(String input) {
        Optional<String> optionalInput = Optional.ofNullable(input);
        
        // Using map without using the result; should use ifPresent instead.
        optionalInput.map(value -> { // BUG: OptionalMapUnusedValue
            System.out.println("Value is present: " + value);
            return value;
        });

        // Unreachable if-else statement mutation
        boolean condition = getRuntimeCondition(); // Condition is dynamically determined
        if (condition) {
            System.out.println("This block will never execute.");
        } else {
            System.out.println("This branch is always executed as condition is false.");
        }

        return "Check console output for demonstration.";
    }

    // Method to ensure the condition is determined at runtime
    private boolean getRuntimeCondition() {
        return false; // it will always return false, ensuring the if block is unreachable
    }

    public static void main(String[] args) {
        OptionalMapBugExample example = new OptionalMapBugExample();
        example.showBug("Example String");
    }
}