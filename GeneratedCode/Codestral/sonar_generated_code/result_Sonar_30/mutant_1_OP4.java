import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BuggyRegex {
    public String showBug(String input) {
        Pattern pattern = Pattern.compile("\\c" + input);
        Matcher matcher = pattern.matcher("Example string");
        boolean shouldRun = getCondition();
        if (shouldRun) {
            return matcher.find()? "Match found" : "Match not found";
        } else {
            System.out.println("This branch is unreachable due to the false condition");
            return "Unreachable branch executed"; // This line will never be executed
        }
    }

    private boolean getCondition() {
        return false; // Return false to make the if condition unreachable
    }

    public static void main(String[] args) {
        BuggyRegex buggyRegex = new BuggyRegex();
        System.out.println(buggyRegex.showBug("a")); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        System.out.println(buggyRegex.showBug("!")); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
    }
}