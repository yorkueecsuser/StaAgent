import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BugExample {
    public static String showBug() {
        Pattern pattern = Pattern.compile("\\1(.)"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("abcdefg");
        matcher.find();
        return matcher.group(1);
    }

    public static void main(String[] args) {
        try {
            System.out.println(showBug());
        } catch (IndexOutOfBoundsException exception) { // Mutation: Renaming "e" to "exception"
            System.out.println("Caught expected exception: " + exception); // Mutation: Renaming "e" to "exception"
        }
    }
}