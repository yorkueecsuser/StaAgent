import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
int gprcsddn = 0;switch  (gprcsddn) {case 1:short bugjzfcz = 889;break;default:float swsgpawk = -302632539;break;}

        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    
}

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}