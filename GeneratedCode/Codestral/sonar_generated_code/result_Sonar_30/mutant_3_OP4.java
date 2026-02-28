import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BuggyRegex {
    public String showBug(String input) {
        Pattern pattern = Pattern.compile("\\c" + input);
        Matcher matcher = pattern.matcher("Example string");
        boolean alwaysFalseCondition = getCondition();
        if (alwaysFalseCondition) {
            return "This should never happen";
        } else {
            return matcher.find()? "Match found" : "Match not found";
        }
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggyRegex buggyRegex = new BuggyRegex();
        System.out.println(buggyRegex.showBug("a"));
        System.out.println(buggyRegex.showBug("!"));
    }
}