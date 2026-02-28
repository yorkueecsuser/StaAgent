import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class BugExample {

    public void showBug() {
        try {
            Pattern.compile("\\ca");
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage());
        }

        try {
            Pattern.compile("\\c!");
        } catch (PatternSyntaxException e) {
            String unreachableCode = "Unreachable code"; // Mutant code - unreachable if statement
            System.out.println(unreachableCode);
            System.out.println(e.getMessage());
        }
    }

    public void showBugCompliant() {
        Pattern.compile("\\cA");
        Pattern.compile("\\c^");
    }
}