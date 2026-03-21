import java.util.Optional;

class OptionalBug {
    public Optional<String> getOptionalString(boolean returnNull) {
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        return Optional.of("Hello, World!");
    }

    // Mutant code: Unreachable if statement
    public void unreachableIfStatement() {
        boolean condition = false; // This condition is always false to make the if statement unreachable
        if (condition) {
            System.out.println("This line will never be executed.");
        }
    }

    public Optional<String> showBug() {
        unreachableIfStatement(); // Calling the method with the unreachable if statement
        return getOptionalString(true);
    }
}