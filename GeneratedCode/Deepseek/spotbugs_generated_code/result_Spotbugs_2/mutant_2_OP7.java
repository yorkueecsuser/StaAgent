import java.util.Optional;

class OptionalBug {
    public Optional<String> getOptionalString(boolean returnNull) {
        if (returnNull) {
            // Inserted unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This block will never be executed
            }
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        return Optional.of("Hello, World!");
    }

    public Optional<String> showBug() {
        return getOptionalString(true);
    }

    private boolean getCondition() {
        return false;
    }
}