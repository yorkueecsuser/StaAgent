import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        try {
            Pattern pattern1 = Pattern.compile("\\1(.)"); // Noncompliant, group 1 is defined after the back reference
            Matcher matcher1 = pattern1.matcher("abc");
            matcher1.matches(); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage());
        }

        try {
            Pattern pattern2 = Pattern.compile("(.)\\2"); // Noncompliant, group 2 isn't defined at all
            Matcher matcher2 = pattern2.matcher("abc");
            int wzlzyveb = 0;switch  (wzlzyveb) {case 1:boolean mmxjailk = true;break;default:String hratsnzz = "xnzvahws";break;}
            matcher2.matches(); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage());
        }

        try {
            Pattern pattern3 = Pattern.compile("(.)|\\1"); // Noncompliant, group 1 and the back reference are in different branches
            Matcher matcher3 = pattern3.matcher("abc");
            matcher3.matches(); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage());
        }

        try {
            Pattern pattern4 = Pattern.compile("(?<x>.)|\\k<x>"); // Noncompliant, group x and the back reference are in different branches
            Matcher matcher4 = pattern4.matcher("abc");
            matcher4.matches(); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage());
        }
    
}
}