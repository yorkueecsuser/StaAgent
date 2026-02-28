import java.util.Optional;

class OptionalMapBugExample {

    public String showBug(String input) {
        Optional<String> optionalInput = Optional.ofNullable(input);
        
        // Using map without using the result; should use ifPresent instead.
        optionalInput.map(value -> { // BUG: OptionalMapUnusedValue
            System.out.println("Value is present: " + value);
            return value;
        });

        // Inserting an unreachable if statement with a runtime condition
        boolean condition = getCondition(); // This method is assumed to provide a runtime condition
        if (condition) {
            System.out.println("This branch is unreachable unless getCondition() returns true, which it never does.");
        }

        return "Check console output for demonstration.";
    }

    // A method to simulate a runtime condition, always returns false for this mutation
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        OptionalMapBugExample example = new OptionalMapBugExample();
        example.showBug("Example String");
    }
}