import java.util.Optional;

class OptionalMapBugExample {

    public String showBug(String input) {
        Optional<String> optionalInput = Optional.ofNullable(input);
        
        // Using map without using the result; should use ifPresent instead.
        optionalInput.map(value -> { // BUG: OptionalMapUnusedValue
            System.out.println("Value is present: " + value);
            return value;
        });

        // Duplication Mutation: Duplicating an assignment statement
        Optional<String> anotherOptionalInput = Optional.ofNullable(input);
        Optional<String> anotherOptionalInputDuplicate = anotherOptionalInput; // Duplicate assignment

        return "Check console output for demonstration.";
    }

    public static void main(String[] args) {
        OptionalMapBugExample example = new OptionalMapBugExample();
        example.showBug("Example String");
    }
}