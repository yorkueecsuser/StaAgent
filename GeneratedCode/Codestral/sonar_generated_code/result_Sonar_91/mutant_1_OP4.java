import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str); // BUG: "null" should not be used with "Optional"

        // Mutant: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This code will never be executed
            System.out.println("This is an unreachable if-else branch");
        } else {
            // This code will always be executed
            System.out.println("This code will always be executed");
        }

        return optionalStr;
    }

    // Method to determine the condition dynamically at runtime
    private boolean getCondition() {
        // Implement logic to determine the condition dynamically
        return false; // For the sake of this example, always return false
    }
}