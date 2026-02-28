import java.util.Optional;

class OptionalBug {
    private boolean getCondition() {
        return false;
    }

    public Optional<String> getOptionalString(boolean returnNull) {
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        if (getCondition()) { // Unreachable if-else branch (Mutation Operator: Unreachable if-else statement)
            // This branch is unreachable because getCondition() always returns false
            throw new IllegalStateException("This branch should be unreachable");
        } else {
            return Optional.of("Hello, World!");
        }
    }

    public Optional<String> showBug() {
        return getOptionalString(true);
    }
}