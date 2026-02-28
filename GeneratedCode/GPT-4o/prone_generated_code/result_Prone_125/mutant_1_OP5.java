import java.util.Optional;

class OptionalMapBugExample {

    public String showBug(String input) {
        Optional<String> optionalInput = Optional.ofNullable(input);
        
        // Using map without using the result; should use ifPresent instead.
        optionalInput.map(value -> { // BUG: OptionalMapUnusedValue
            System.out.println("Value is present: " + value);
            return value;
        });

        // Inserting unreachable switch statement
        int unreachableSwitchCondition = generateUnreachableCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This case will never be hit.");
                break;
            default:
                System.out.println("Default case, will never be reached.");
        }

        return "Check console output for demonstration.";
    }

    private int generateUnreachableCondition() {
        return 0; // This ensures that the switch statement above is unreachable
    }

    public static void main(String[] args) {
        OptionalMapBugExample example = new OptionalMapBugExample();
        example.showBug("Example String");
    }
}