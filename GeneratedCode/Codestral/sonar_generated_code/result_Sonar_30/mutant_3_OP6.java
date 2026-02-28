import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BuggyRegex {
    public String showBug(String input) {
        Pattern pattern = Pattern.compile("\\c" + input);
        // Mutant code - Unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because the condition is always false
        }
        Matcher matcher = pattern.matcher("Example string");
        return matcher.find()? "Match found" : "Match not found";
    }

    public static void main(String[] args) {
        BuggyRegex buggyRegex = new BuggyRegex();
        System.out.println(buggyRegex.showBug("a"));
        System.out.println(buggyRegex.showBug("!"));
    }
}