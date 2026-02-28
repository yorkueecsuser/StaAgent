import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug(String input) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            System.out.println("This is an unreachable loop");
        }
        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}