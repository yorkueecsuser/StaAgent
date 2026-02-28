import java.util.Optional;

class OptionalBug {
    public Optional<String> getOptionalString(boolean retNull) {
        if (retNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        return Optional.of("Hello, World!");
    }

    public Optional<String> showBug() {
        return getOptionalString(true);
    }
}