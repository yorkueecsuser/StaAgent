import java.util.Optional;

class OptionalBug {
    public Optional<String> getOptionalString(boolean returnNull) {
        if (returnNull) {
            // Adding a do-while loop equivalent to the if statement
            do {
                return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
            } while (false); // The loop condition is set to false to ensure it runs only once
        }
        return Optional.of("Hello, World!");
    }

    public Optional<String> showBug() {
        return getOptionalString(true);
    }
}