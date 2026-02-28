import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
        String validatedInput = Objects.requireNonNull(input); // Duplicated assignment statement
        return String.format("Invalid input: %d", validatedInput);
        return String.format("Duplicated input: %s", validatedInput); // Added mutant code
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}