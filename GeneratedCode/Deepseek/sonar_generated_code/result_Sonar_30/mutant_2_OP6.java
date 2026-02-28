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
            System.out.println(e.getMessage());
        }

        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) { /* code */ }
    }

    public void showBugCompliant() {
        Pattern.compile("\\cA");
        Pattern.compile("\\c^");
    }
}