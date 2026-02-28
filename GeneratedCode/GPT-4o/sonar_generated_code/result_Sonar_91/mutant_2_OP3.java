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
        
        // Inserted unreachable if branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This will never be printed.");
        }
    }
    
    // Method to simulate a condition that is always false at runtime
    private static boolean getUnreachableCondition() {
        return false;
    }
}