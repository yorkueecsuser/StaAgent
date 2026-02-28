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
        
        // Unreachable switch statement
        int unreachableSwitchCondition = getUnreachableValue();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This will never be reached.");
                break;
            default:
                // Do nothing
                break;
        }
    }
    
    private static int getUnreachableValue() {
        return 0; // Always returns 0, which is not matched by any case
    }
}