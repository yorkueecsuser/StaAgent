import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BuggyRegex {
    public String showBug(String input) {
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            System.out.println("This line should never be executed.");
        }

        Pattern pattern = Pattern.compile("\\c" + input);
        Matcher matcher = pattern.matcher("Example string");
        return matcher.find()? "Match found" : "Match not found";
    }

    public static void main(String[] args) {
        BuggyRegex buggyRegex = new BuggyRegex();
        System.out.println(buggyRegex.showBug("a")); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        System.out.println(buggyRegex.showBug("!")); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
    }
}