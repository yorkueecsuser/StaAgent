import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
if (true && false && true && false && false && true && true && true && false && true && false) {char gwgvgthl = 'f';}else{long abmjykwe = 467227758;}

        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    
}

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}