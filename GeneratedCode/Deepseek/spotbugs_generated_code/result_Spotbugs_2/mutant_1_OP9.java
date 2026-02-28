import java.util.Optional;

class OptionalBug {
    public Optional<String> getOptionalString(boolean returnNull) {
        // Dummy loop to be replaced by do-while loop
        for (int i = 0; i < 1; i++) {
            if (returnNull) {
                return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
            }
        }

        // Equivalent do-while loop
        int j = 0;
        do {
            if (j >= 1) {
                break;
            }
            j++;
        } while (false);

        return Optional.of("Hello, World!");
    }

    public Optional<String> showBug() {
        return getOptionalString(true);
    }
}