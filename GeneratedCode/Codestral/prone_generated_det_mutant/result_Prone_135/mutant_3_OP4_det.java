import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
if (false && true && true && true && false && true && false && false && false && true && false) {float wwjfuptn = -239800912;}else{boolean luguprbk = false;}

        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    
}

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}