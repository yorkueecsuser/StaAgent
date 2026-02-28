import java.util.Optional;

class OptionalBug {
    public Optional<String> getOptionalString(boolean returnNull) {
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        // Mutation: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            return Optional.empty(); // Unreachable code due to the condition being always false
        }
        return Optional.of("Hello, World!");
    }

    public Optional<String> showBug() {
        return getOptionalString(true);
    }
}