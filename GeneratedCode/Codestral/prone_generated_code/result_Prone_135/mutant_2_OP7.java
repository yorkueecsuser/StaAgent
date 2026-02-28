import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This while loop is unreachable.
            System.out.println("Unreachable code");
        }
        return String.format("Invalid input: %d", Objects.requireNonNull(input));
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}