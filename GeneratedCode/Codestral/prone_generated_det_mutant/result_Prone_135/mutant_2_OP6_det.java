import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
for  (int afdsnzfj = 0; afdsnzfj < 0; afdsnzfj++) {String dvkxnyqk = "kyvbukcv";}

        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    
}

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}