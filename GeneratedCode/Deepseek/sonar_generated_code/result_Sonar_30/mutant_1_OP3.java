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

        // This will be the mutant code
        if (false) {
            try {
                Pattern.compile("\\cX");
            } catch (PatternSyntaxException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void showBugCompliant() {
        Pattern.compile("\\cA");
        Pattern.compile("\\c^");
    }
}