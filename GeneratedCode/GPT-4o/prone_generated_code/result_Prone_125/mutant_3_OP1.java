import java.util.Optional;

class OptionalMapBugExample {

    public String showBug(String input) {
        Optional<String> optionalInput = Optional.ofNullable(input);
        
        // Using map without using the result; should use ifPresent instead.
        optionalInput.map(value -> { // BUG: OptionalMapUnusedValue
            System.out.println("Value is present: " + value);
            return value;
        });

        // Dead Store: Unused variable declaration added
        int xylzabcd = 42;

        return "Check console output for demonstration.";
    }

    public static void main(String[] args) {
        OptionalMapBugExample example = new OptionalMapBugExample();
        example.showBug("Example String");
    }
}