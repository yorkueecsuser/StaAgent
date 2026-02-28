import java.util.Optional;

class OptionalBug {
    private boolean getFalseCondition() {
        return false;
    }

    public Optional<String> getOptionalString(boolean returnNull) {
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }

        // Mutant: Unreachable switch statement
        boolean condition = getFalseCondition();
        if (condition) {
            int value = 1;
            switch (value) {
                case 2:
                    System.out.println("This line will never be executed.");
                    break;
            }
        }

        return Optional.of("Hello, World!");
    }

    public Optional<String> showBug() {
        return getOptionalString(true);
    }
}