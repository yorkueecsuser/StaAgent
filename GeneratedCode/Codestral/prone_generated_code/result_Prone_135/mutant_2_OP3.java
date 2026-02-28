import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
        // Introducing the unreachable if statement
        if (isConditionFalse()) {
            // This code will never execute
            throw new IllegalStateException("This is an unreachable branch");
        }
        return String.format("Invalid input: %d", Objects.requireNonNull(input));
    }

    public boolean isConditionFalse() {
        // This method always returns false, making the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}