import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
        String i = Objects.requireNonNull(input); // Mutant: Renaming user-defined variable 'input' to 'i'
        return String.format("Invalid input: %d", i);
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}