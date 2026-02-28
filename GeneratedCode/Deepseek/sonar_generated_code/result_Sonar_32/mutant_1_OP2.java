import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BugExample {
    public static String showBug() {
        Pattern pattern = Pattern.compile("\\1(.)"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("abcdefg");
        matcher.find();
        return matcher.group(1);
    }

    public static String showBugMutant1() {
        Pattern pattern = Pattern.compile("\\1(.)"); // Mutant: Duplicating the assignment statement
        Pattern pattern2 = Pattern.compile("\\1(.)"); // Mutant: Adding a new assignment statement
        Matcher matcher = pattern.matcher("abcdefg");
        Matcher matcher2 = pattern2.matcher("abcdefg");
        matcher.find();
        matcher2.find();
        return matcher.group(1);
    }

    public static void main(String[] args) {
        try {
            System.out.println(showBug());
            System.out.println(showBugMutant1());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught expected exception: " + e);
        }
    }
}