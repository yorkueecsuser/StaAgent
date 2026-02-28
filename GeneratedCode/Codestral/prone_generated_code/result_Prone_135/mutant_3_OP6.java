import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
        boolean isFalse = getFalseCondition(); // Dynamically determined false condition
        for (int i = 0; isFalse; i++) { // Unreachable for loop
            System.out.println("This is an unreachable loop.");
        }
        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    }

    private boolean getFalseCondition() {
        return false; // Always returns false
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}