import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BugExample {
    public static String showBug() {
        Pattern pattern = Pattern.compile("\\1(.)"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("abcdefg");
        matcher.find();
        return matcher.group(1);
    }

    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        try {
            if (getCondition()) {
                System.out.println(showBug());
            } else {
                // This branch is unreachable but added to prevent unreachable statement error
                System.out.println("Unreachable");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught expected exception: " + e);
        }
    }
}