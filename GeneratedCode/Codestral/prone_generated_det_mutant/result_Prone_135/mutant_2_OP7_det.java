import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
boolean caursfzb = false;while (caursfzb && true && false && true && false && true && true && true && false && false && true && false) {boolean gjfftwko = false;}

        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    
}

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}