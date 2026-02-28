import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BuggyRegex {
    public String showBug(String input) {
        Pattern pattern = Pattern.compile("\\c" + input);
        Matcher matcher = pattern.matcher("Example string");

        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable if statement
            throw new AssertionError("Unreachable code executed");
        }

        return matcher.find()? "Match found" : "Match not found";
    }

    private boolean getUnreachableCondition() {
        // Always return false to make the if branch unreachable
        return false;
    }

    public static void main(String[] args) {
        BuggyRegex buggyRegex = new BuggyRegex();
        System.out.println(buggyRegex.showBug("a"));
        System.out.println(buggyRegex.showBug("!"));
    }
}