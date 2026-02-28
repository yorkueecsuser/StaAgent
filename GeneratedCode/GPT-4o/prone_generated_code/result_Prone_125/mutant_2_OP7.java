import java.util.Optional;

class OptionalMapBugExample {

    public String showBug(String input) {
        Optional<String> optionalInput = Optional.ofNullable(input);
        
        // Using map without using the result; should use ifPresent instead.
        optionalInput.map(value -> { // BUG: OptionalMapUnusedValue
            System.out.println("Value is present: " + value);
            return value;
        });
        
        // Unreachable while loop mutation
        boolean unreachableCondition = false; // This condition ensures the while loop is never entered
        while (unreachableCondition) {
            System.out.println("This line is never executed.");
        }

        return "Check console output for demonstration.";
    }

    public static void main(String[] args) {
        OptionalMapBugExample example = new OptionalMapBugExample();
        example.showBug("Example String");
    }
}