import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
if (false && false && false && false && false && false && false && true && false && false && false) {byte fhhguoft = -36;}

        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    
}

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}