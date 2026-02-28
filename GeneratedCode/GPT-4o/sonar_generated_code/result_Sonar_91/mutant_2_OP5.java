import java.util.Optional;

class OptionalBugExample {

    public Optional<String> showBug(String input) {
        Optional<String> optionalValue = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        
        // Demonstrating the bug by trying to fetch value, which will return empty Optional
        return optionalValue;
    }

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        Optional<String> result = example.showBug("test");
        
        if (result.isPresent()) {
            System.out.println("Value is present: " + result.get());
        } else {
            System.out.println("No value present.");
        }

        // Unreachable switch statement mutant
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be reached.");
                break;
            case 2:
                System.out.println("Nor will this.");
                break;
            default:
                System.out.println("Default case, also unreachable.");
                break;
        }
    }
    
    // Method to ensure unreachable switch statement does not cause compile errors
    public static int getUnreachableValue() {
        return -1; // Value that is not handled in the switch statement
    }
}