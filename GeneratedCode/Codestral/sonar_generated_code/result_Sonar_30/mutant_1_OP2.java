import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BuggyRegex {
    public String showBug(String input) {
        Pattern pattern = Pattern.compile("\\c" + input);
        Pattern duplicatePattern = Pattern.compile("\\c" + input); // Mutant: Duplicated assignment statement
        Matcher matcher = pattern.matcher("Example string");
        Matcher duplicateMatcher = duplicatePattern.matcher("Example string"); // Mutant: Created matcher for the duplicate pattern
        return matcher.find()? "Match found" : "Match not found";
    }

    public static void main(String[] args) {
        BuggyRegex buggyRegex = new BuggyRegex();
        System.out.println(buggyRegex.showBug("a"));
        System.out.println(buggyRegex.showBug("!"));
    }
}