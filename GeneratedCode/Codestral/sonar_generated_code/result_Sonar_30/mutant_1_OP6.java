import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BuggyRegex {
    public String showBug(String input) {
        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed.");
        }

        Pattern pattern = Pattern.compile("\\c" + input);
        Matcher matcher = pattern.matcher("Example string");
        return matcher.find()? "Match found" : "Match not found";
    }

    // Method to return false, making the for loop unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggyRegex buggyRegex = new BuggyRegex();
        System.out.println(buggyRegex.showBug("a")); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        System.out.println(buggyRegex.showBug("!")); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
    }
}