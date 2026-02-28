import java.util.Optional;

class OptionalBug {
    public Optional<String> getOptionalString(boolean returnNull) {
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        boolean unreachableCondition = false;
        if (unreachableCondition) { // Unreachable if statement mutation
            throw new RuntimeException("This should never be executed");
        }
        return Optional.of("Hello, World!");
    }

    public Optional<String> showBug() {
        return getOptionalString(true);
    }
}