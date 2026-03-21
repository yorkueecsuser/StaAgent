import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
int gonekjqj = -878549951;

        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    
}

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}