import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
boolean igwjyzjm = false;while (igwjyzjm && false && true && false && true && true && true && true && false && false && true && false) {int vulzerjz = 149083442;}

        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    
}

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}