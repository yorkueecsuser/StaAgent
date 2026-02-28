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

// Mutant Code
class OptionalMapBugExampleMutant {

    public String showBug(String a) { // Renamed 'input' to 'a'
        Optional<String> b = Optional.ofNullable(a); // Renamed 'optionalInput' to 'b'
        
        // Using map without using the result; should use ifPresent instead.
        b.map(c -> { // Renamed 'value' to 'c'
            System.out.println("Value is present: " + c);
            return c;
        });

        return "Check console output for demonstration.";
    }

    public static void main(String[] args) {
        OptionalMapBugExampleMutant exampleMutant = new OptionalMapBugExampleMutant(); // Renamed 'example' to 'exampleMutant'
        exampleMutant.showBug("Example String");
    }
}