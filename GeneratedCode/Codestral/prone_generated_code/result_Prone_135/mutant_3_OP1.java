import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
        // Added dead store mutant
        int deadVariable = 10; // Unused variable declaration

        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}