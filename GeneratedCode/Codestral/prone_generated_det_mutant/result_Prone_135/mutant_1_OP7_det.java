import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
boolean gjqposbq = false;while (gjqposbq && true && true && false && true && true && true && false && true && true && false && false) {short qfjjkoor = 209;}

        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    
}

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}