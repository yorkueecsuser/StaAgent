import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BuggyRegex {
    public String showBug(String input) {
        Pattern pattern = Pattern.compile("\\c" + input);
        Pattern pattern2 = Pattern.compile("\\c" + input); // Inserted mutant
        Matcher matcher = pattern.matcher("Example string");
        Matcher matcher2 = pattern2.matcher("Example string"); // Inserted mutant
        return matcher.find()? "Match found" : "Match not found";
    }

    public static void main(String[] args) {
        BuggyRegex buggyRegex = new BuggyRegex();
        System.out.println(buggyRegex.showBug("a")); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        System.out.println(buggyRegex.showBug("!")); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
    }
}