import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
if (true && false && true && false && true && false && true && false && true && false && false) {byte rhpordch = -94;}

        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    
}

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}