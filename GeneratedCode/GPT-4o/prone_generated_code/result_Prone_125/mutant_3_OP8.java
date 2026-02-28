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

// Mutant code with renamed variable
class OptionalMapBugExampleMutant {

    public String showBug(String j) {
        Optional<String> x = Optional.ofNullable(j);
        
        // Using map without using the result; should use ifPresent instead.
        x.map(y -> { // BUG: OptionalMapUnusedValue
            System.out.println("Value is present: " + y);
            return y;
        });

        return "Check console output for demonstration.";
    }

    public static void main(String[] args) {
        OptionalMapBugExampleMutant exampleMutant = new OptionalMapBugExampleMutant();
        exampleMutant.showBug("Example String");
    }
}