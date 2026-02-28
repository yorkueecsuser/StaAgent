import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class BackReferenceBug {

    public void showBug1() {
        Pattern pattern = Pattern.compile("\\1(.)"); // BUG: Back reference to group 1 before it is defined
        Matcher matcher = pattern.matcher("a");
        System.out.println(matcher.matches()); // Should print false
    }

    public void showBug2() {
        Pattern pattern = Pattern.compile("(.)\\2"); // BUG: Back reference to group 2 which is not defined
        Matcher matcher = pattern.matcher("aa");
        System.out.println(matcher.matches()); // Should print false
    }

    public void showBug3() {
        Pattern pattern = Pattern.compile("(.)|\\1"); // BUG: Group 1 and the back reference are in different branches
        Matcher matcher = pattern.matcher("a");
        System.out.println(matcher.matches()); // Should print true, but the back reference will never match
    }

    public void showBug4() {
        try {
            Pattern pattern = Pattern.compile("(?<x>.)|\\k<x>"); // BUG: Group x and the back reference are in different branches
            Matcher matcher = pattern.matcher("a");
            System.out.println(matcher.matches()); // This line will never be reached
        } catch (PatternSyntaxException e) {
            System.out.println("Caught PatternSyntaxException: " + e.getMessage()); // Should print an error message
        }
    }
}