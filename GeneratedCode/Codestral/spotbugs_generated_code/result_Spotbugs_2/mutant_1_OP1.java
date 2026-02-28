import java.util.Optional;
import java.util.Random;

class OptionalBug {
    public Optional<String> getOptionalString(boolean returnNull) {
        if (returnNull) {
            char unusedVariable = randomChar(); // Dead Store: Unused variable declaration
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        return Optional.of("Hello, World!");
    }

    public Optional<String> showBug() {
        return getOptionalString(true);
    }

    private char randomChar() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }
}