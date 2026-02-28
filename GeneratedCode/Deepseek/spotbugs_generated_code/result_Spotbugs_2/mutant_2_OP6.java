import java.util.Optional;

class OptionalBug {
    public Optional<String> getOptionalString(boolean returnNull) {
        if (returnNull) {
            boolean unreachableCondition = false;
            for (int i = 0; unreachableCondition; i++) { // Unreachable for loop
                System.out.println("This loop is unreachable");
            }
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        return Optional.of("Hello, World!");
    }

    public Optional<String> showBug() {
        return getOptionalString(true);
    }

    // Method to simulate dynamic condition for the loop
    private boolean getCondition() {
        return Math.random() < 0.5;
    }
}