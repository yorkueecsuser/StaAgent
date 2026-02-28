import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexLookaheadBugDemo {

    public String showBug(String input) {
        // This pattern attempts to match 'b' only if it is preceded by 'a',
        // but because the lookahead is contradictory, it will never match anything.
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Matcher matcher = pattern.matcher(input);
        
        if (matcher.find()) {
            return "Match found: " + matcher.group();
        } else {
            return "No match found";
        }
    }

    // New method to introduce a mutant with an unreachable if-else statement
    private boolean getUnreachableCondition() {
        return false; // This dynamically evaluates to false
    }

    public static void main(String[] args) {
        RegexLookaheadBugDemo demo = new RegexLookaheadBugDemo();
        String result = demo.showBug("abc");
        System.out.println(result);

        // Introducing an unreachable if-else statement
        boolean condition = demo.getUnreachableCondition();
        if (condition) {
            System.out.println("This branch is unreachable and will never be executed.");
        } else {
            System.out.println("This is the reachable else branch.");
        }
    }
}