import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
        String validInput = Objects.requireNonNull(input);
        String validInputDuplicate = validInput; // Mutant code added here
        return String.format("Invalid input: %s", validInput);
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}