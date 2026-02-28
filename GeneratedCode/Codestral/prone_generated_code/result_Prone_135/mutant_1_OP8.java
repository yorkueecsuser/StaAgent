import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
        String i = input; // Renamed variable from input to i
        return String.format("Invalid input: %d", Objects.requireNonNull(i));
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}