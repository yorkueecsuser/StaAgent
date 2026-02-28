import java.util.Optional;

class OptionalMapBugExample {

    public String showBug(String input) {
        Optional<String> optionalInput = Optional.ofNullable(input);
        
        // Using map without using the result; should use ifPresent instead.
        optionalInput.map(value -> { // BUG: OptionalMapUnusedValue
            System.out.println("Value is present: " + value);
            return value;
        });
        
        // Unreachable if statement added as a mutant
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This block is unreachable due to false condition.");
        }

        return "Check console output for demonstration.";
    }
    
    // Helper method to simulate a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        OptionalMapBugExample example = new OptionalMapBugExample();
        example.showBug("Example String");
    }
}