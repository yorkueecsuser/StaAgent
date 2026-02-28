import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
        String requiredInput = Objects.requireNonNull(input);
        String duplicateInput = requiredInput; // Mutated line: Duplication
        return String.format("Invalid input: %s", requiredInput); // BUG: PreconditionsInvalidPlaceholder
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}