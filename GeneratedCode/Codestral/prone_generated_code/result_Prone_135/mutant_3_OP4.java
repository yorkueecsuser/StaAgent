import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(String input) {
        boolean shouldRun = getUnreachableCondition();
        if (shouldRun) {
            // This part of the code is unreachable due to the false condition
            throw new RuntimeException("Unreachable code should never execute!");
        } else {
            return String.format("Invalid input: %d", Objects.requireNonNull(input));
        }
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}