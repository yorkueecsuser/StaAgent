import java.util.Optional;

class OptionalBugDemo {

    // Method intentionally returns null despite having an Optional return type
    public Optional<String> getOptionalString(boolean returnNull) {
        boolean unreachableCondition = getUnreachableCondition(); // Non-final variable for unreachable condition
        while (unreachableCondition) {
            // Unreachable loop body
            System.out.println("This is unreachable code.");
        }
        
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        return Optional.of("Valid String");
    }

    // Method to demonstrate the bug
    public Optional<String> showBug(boolean returnNull) {
        boolean unreachableCondition = getUnreachableCondition(); // Non-final variable for unreachable condition
        while (unreachableCondition) {
            // Unreachable loop body
            System.out.println("This is also unreachable code.");
        }

        return getOptionalString(returnNull);
    }

    // Helper method to provide a non-final condition for unreachable while loop
    private boolean getUnreachableCondition() {
        return false; // The condition is always false, making it unreachable
    }

    public static void main(String[] args) {
        OptionalBugDemo demo = new OptionalBugDemo();
        
        // Demonstrating the bug
        Optional<String> result = demo.showBug(true);
        if (result == null) {
            System.out.println("Bug encountered: Optional<String> returned as null.");
        } else {
            result.ifPresent(System.out::println);
        }
    }
}