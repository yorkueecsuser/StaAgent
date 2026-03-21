import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
int cndgojfu = 0;switch  (cndgojfu) {case 1:byte oobgloab = -52;break;default:String zcycmyae = "fjcmdouu";break;}

        return String.format("Invalid input: %d", Objects.requireNonNull(input)); // BUG: PreconditionsInvalidPlaceholder
    
}

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}