import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(String input) {
        // Added unreachable if-else mutant
        if (getUnreachableCondition()) {
            System.out.println("This line is unreachable.");
        } else {
            return String.format("Invalid input: %d", Objects.requireNonNull(input));
        }
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}