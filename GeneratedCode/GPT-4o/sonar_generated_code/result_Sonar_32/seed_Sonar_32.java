import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class RegexBackReferenceBug {

    public static void main(String[] args) {
        try {
            showBug1();
        } catch (PatternSyntaxException e) {
            System.out.println("Exception in showBug1: " + e.getDescription());
        }

        try {
            showBug2();
        } catch (PatternSyntaxException e) {
            System.out.println("Exception in showBug2: " + e.getDescription());
        }

        try {
            showBug3();
        } catch (PatternSyntaxException e) {
            System.out.println("Exception in showBug3: " + e.getDescription());
        }

        try {
            showBug4();
        } catch (PatternSyntaxException e) {
            System.out.println("Exception in showBug4: " + e.getDescription());
        }
    }

    public static void showBug1() {
        Pattern.compile("\\1(.)"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    }

    public static void showBug2() {
        Pattern.compile("(.)\\2"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    }

    public static void showBug3() {
        Pattern.compile("(.)|\\1"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    }

    public static void showBug4() {
        Pattern.compile("(?<x>.)|\\k<x>"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    }
}