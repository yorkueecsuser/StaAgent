import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(String input) {
        if (getUnreachableCondition()) {
            System.out.println("This block will never be executed");
        }
        return String.format("Invalid input: %d", Objects.requireNonNull(input));
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}