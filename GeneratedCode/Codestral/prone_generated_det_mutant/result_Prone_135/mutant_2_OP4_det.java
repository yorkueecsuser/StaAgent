import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
if (true && true && true && true && false && true && false && true && false && true && false) {byte qxgpbsnw = -125;}else{long nvtwjthp = 112141270;}

        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    
}

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}