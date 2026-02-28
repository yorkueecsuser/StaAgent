import java.util.Optional;

class OptionalBugExample {

    public Optional<String> showBug(String input) {
        Optional<String> optionalValue = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        
        // Demonstrating the bug by trying to fetch value, which will return empty Optional
        
        // Introducing an unreachable while loop
        boolean unreachableCondition = getCondition();
        while (unreachableCondition) {
            System.out.println("This will never be printed.");
        }

        return optionalValue;
    }

    private boolean getCondition() {
        return false; // Always returns false making the while loop unreachable
    }

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        Optional<String> result = example.showBug("test");
        
        if (result.isPresent()) {
            System.out.println("Value is present: " + result.get());
        } else {
            System.out.println("No value present.");
        }
    }
}