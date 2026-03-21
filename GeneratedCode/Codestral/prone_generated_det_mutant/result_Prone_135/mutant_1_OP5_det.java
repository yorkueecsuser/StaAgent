import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
int qltnmqzj = 0;switch  (qltnmqzj) {case 1:long uotnuwmo = -412084062;break;default:char byisniiv = 'o';break;}

        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    
}

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}