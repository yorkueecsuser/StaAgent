import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
        boolean shouldNotRun = false;
        switch (shouldNotRun) {
            case true:
                // This case should never be executed
                System.out.println("This is an unreachable switch case!");
                break;
        }
        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}