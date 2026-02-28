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

        // Introduce an unreachable if-else branch
        boolean alwaysFalseCondition = getFalseCondition();
        if (alwaysFalseCondition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This else block is reachable.");
        }
    }
    
    // Method to ensure the condition is not a compile-time constant
    private static boolean getFalseCondition() {
        return false;
    }
}