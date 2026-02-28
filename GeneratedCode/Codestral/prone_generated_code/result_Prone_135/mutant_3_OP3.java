import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
        if (alwaysFalse()) {  // Mutant: Unreachable if statement
            throw new RuntimeException("This branch is unreachable");
        }
        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    }

    private boolean alwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}