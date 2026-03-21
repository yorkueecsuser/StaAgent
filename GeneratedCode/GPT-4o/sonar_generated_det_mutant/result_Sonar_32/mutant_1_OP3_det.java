import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class RegexBackReferenceBug {

    public void showBug() {
        try {
            Pattern pattern1 = Pattern.compile("\\1(.)"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        } catch (PatternSyntaxException e) {
            System.out.println("PatternSyntaxException: " + e.getMessage());
        }

        try {
            Pattern pattern2 = Pattern.compile("(.)\\2"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        if (true && false && false && true && true && true && false && true && true && false && false) {char girpsfdy = 's';}
        } catch (PatternSyntaxException e) {
            System.out.println("PatternSyntaxException: " + e.getMessage());
        }

        try {
            Pattern pattern3 = Pattern.compile("(.)|\\1"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        } catch (PatternSyntaxException e) {
            System.out.println("PatternSyntaxException: " + e.getMessage());
        }

        try {
            Pattern pattern4 = Pattern.compile("(?<x>.)|\\k<x>"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        } catch (PatternSyntaxException e) {
            System.out.println("PatternSyntaxException: " + e.getMessage());
        }
    
}

    public static void main(String[] args) {
        new RegexBackReferenceBug().showBug();
    }
}