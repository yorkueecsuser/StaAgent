import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BuggyRegex {
    public String showBug(String input) {
        Pattern pattern = Pattern.compile("\\c" + input);
        Matcher matcher = pattern.matcher("Example string");

        // Inserted unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This line will never be executed");
        }

        return matcher.find()? "Match found" : "Match not found";
    }

    public static void main(String[] args) {
        BuggyRegex buggyRegex = new BuggyRegex();
        System.out.println(buggyRegex.showBug("a")); // The regex escape sequence \cX should only be used with characters in the @-_ range
        System.out.println(buggyRegex.showBug("!")); // The regex escape sequence \cX should only be used with characters in the @-_ range
    }
}