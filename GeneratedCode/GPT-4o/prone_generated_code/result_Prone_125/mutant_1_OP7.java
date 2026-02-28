import java.util.Optional;

class OptionalMapBugExample {

    public String showBug(String input) {
        Optional<String> optionalInput = Optional.ofNullable(input);
        
        // Using map without using the result; should use ifPresent instead.
        optionalInput.map(value -> { // BUG: OptionalMapUnusedValue
            System.out.println("Value is present: " + value);
            return value;
        });

        // Unreachable while loop insertion
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is intentionally left empty
        }

        return "Check console output for demonstration.";
    }

    private boolean getCondition() {
        // Returning false to simulate an unreachable while loop
        return false;
    }

    public static void main(String[] args) {
        OptionalMapBugExample example = new OptionalMapBugExample();
        example.showBug("Example String");
    }
}