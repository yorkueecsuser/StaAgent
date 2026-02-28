import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BuggyRegex {
    public String showBug(String input) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This is an unreachable block.");
        } else {
            // This is the original block.
            Pattern pattern = Pattern.compile("\\c" + input);
            Matcher matcher = pattern.matcher("Example string");
            return matcher.find()? "Match found" : "Match not found";
        }
    }

    // This method will always return false to ensure the block is unreachable
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggyRegex buggyRegex = new BuggyRegex();
        System.out.println(buggyRegex.showBug("a"));
        System.out.println(buggyRegex.showBug("!"));
    }
}