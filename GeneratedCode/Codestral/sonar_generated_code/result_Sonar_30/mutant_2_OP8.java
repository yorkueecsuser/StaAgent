import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BuggyRegex {
    public String showBug(String charInput) {
        Pattern pattern = Pattern.compile("\\c" + charInput);
        Matcher matcher = pattern.matcher("Example string");
        return matcher.find()? "Match found" : "Match not found";
    }

    public static void main(String[] args) {
        BuggyRegex buggyRegex = new BuggyRegex();
        System.out.println(buggyRegex.showBug("a"));
        System.out.println(buggyRegex.showBug("!"));
    }
}