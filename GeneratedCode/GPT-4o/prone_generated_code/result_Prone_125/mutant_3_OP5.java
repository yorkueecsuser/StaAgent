import java.util.Optional;

class OptionalMapBugExample {

    public String showBug(String input) {
        Optional<String> optionalInput = Optional.ofNullable(input);
        
        // Using map without using the result; should use ifPresent instead.
        optionalInput.map(value -> { // BUG: OptionalMapUnusedValue
            System.out.println("Value is present: " + value);
            return value;
        });

        // Unreachable switch statement
        int condition = getUnreachableCondition();
        switch (condition) {
            case 1:
                System.out.println("This will never be executed.");
                break;
            default:
                break;
        }

        return "Check console output for demonstration.";
    }

    // Method that ensures the switch statement remains unreachable
    private int getUnreachableCondition() {
        return 0; // Always returns 0, making the switch case 1 unreachable.
    }

    public static void main(String[] args) {
        OptionalMapBugExample example = new OptionalMapBugExample();
        example.showBug("Example String");
    }
}