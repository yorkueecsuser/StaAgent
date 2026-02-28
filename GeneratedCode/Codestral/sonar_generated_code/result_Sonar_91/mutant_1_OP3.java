import java.util.Optional;

class OptionalNullBug {
    private boolean alwaysFalse() {
        return false;
    }

    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str); // BUG: "null" should not be used with "Optional"

        // Mutant: Unreachable if statement
        if (alwaysFalse()) {
            // This code will never be executed because the condition is always false
            System.out.println("This is an unreachable statement.");
        }

        return optionalStr;
    }
}