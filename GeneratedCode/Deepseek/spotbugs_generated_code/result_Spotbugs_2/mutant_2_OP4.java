import java.util.Optional;

class OptionalBug {
    public Optional<String> getOptionalString(boolean returnNull) {
        if (returnNull) {
            return null; // Bug: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code should be unreachable.");
            return Optional.of("Unreachable String");
        }

        return Optional.of("Hello, World!");
    }

    public Optional<String> showBug() {
        return getOptionalString(true);
    }
}