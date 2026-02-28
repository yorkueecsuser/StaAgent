import java.util.Optional;

class OptionalMapBugExample {

    public String showBug(String input) {
        Optional<String> optionalInput = Optional.ofNullable(input);
        
        // Using map without using the result; should use ifPresent instead.
        optionalInput.map(value -> { // BUG: OptionalMapUnusedValue
            System.out.println("Value is present: " + value);
            return value;
        });

        // Unreachable if-else statement
        boolean isUnreachable = getUnreachableCondition();
        if (isUnreachable) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This is the reachable block.");
        }

        return "Check console output for demonstration.";
    }

    // Method to simulate a condition that is always false at runtime
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        OptionalMapBugExample example = new OptionalMapBugExample();
        example.showBug("Example String");
    }
}