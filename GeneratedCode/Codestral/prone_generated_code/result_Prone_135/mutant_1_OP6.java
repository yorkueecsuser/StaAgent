import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Unreachable for loop mutant
            System.out.println("This is an unreachable loop");
        }
        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}