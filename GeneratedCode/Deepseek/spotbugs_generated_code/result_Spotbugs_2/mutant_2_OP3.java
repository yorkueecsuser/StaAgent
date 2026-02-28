import java.util.Optional;

class OptionalBug {
    public boolean getCondition() {
        return false; // Always returns false to make the if statement unreachable
    }

    public Optional<String> getOptionalString(boolean returnNull) {
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        if (getCondition()) { // Mutation: Unreachable if statement
            throw new IllegalStateException("This code should never be reached");
        }
        return Optional.of("Hello, World!");
    }

    public Optional<String> showBug() {
        return getOptionalString(true);
    }
}