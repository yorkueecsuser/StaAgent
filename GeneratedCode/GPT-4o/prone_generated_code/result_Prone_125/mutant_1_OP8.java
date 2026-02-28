import java.util.Optional;

class OptionalMapBugExample {

    public String showBug(String input) {
        Optional<String> optionalInput = Optional.ofNullable(input);
        
        // Using map without using the result; should use ifPresent instead.
        optionalInput.map(value -> { // BUG: OptionalMapUnusedValue
            System.out.println("Value is present: " + value);
            return value;
        });

        return "Check console output for demonstration.";
    }

    public static void main(String[] args) {
        OptionalMapBugExample example = new OptionalMapBugExample();
        example.showBug("Example String");
    }
}

// Mutant Code - Renaming 'optionalInput' to 'x'
class OptionalMapBugExampleMutant {

    public String showBug(String input) {
        Optional<String> x = Optional.ofNullable(input);
        
        // Using map without using the result; should use ifPresent instead.
        x.map(value -> { // BUG: OptionalMapUnusedValue
            System.out.println("Value is present: " + value);
            return value;
        });

        return "Check console output for demonstration.";
    }

    public static void main(String[] args) {
        OptionalMapBugExampleMutant example = new OptionalMapBugExampleMutant();
        example.showBug("Example String");
    }
}