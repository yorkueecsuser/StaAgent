import java.util.Optional;

class OptionalBugDemo {

    // Method intentionally returns null despite having an Optional return type
    public Optional<String> getOptionalString(boolean returnNull) {
        // Unreachable if-else branch inserted
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This line is unreachable due to the condition being false.");
        } else {
            System.out.println("This branch is always executed.");
        }

        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        return Optional.of("Valid String");
    }

    // Method to demonstrate the bug
    public Optional<String> showBug(boolean returnNull) {
        return getOptionalString(returnNull);
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

    // Method to provide a false condition for the unreachable branch
    private boolean getFalseCondition() {
        return false; // Ensures the if branch is never taken
    }
}