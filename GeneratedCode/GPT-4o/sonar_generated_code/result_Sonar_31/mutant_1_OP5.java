import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexLookaheadBugDemo {

    public String showBug(String input) {
        // This pattern attempts to match 'b' only if it is preceded by 'a',
        // but because the lookahead is contradictory, it will never match anything.
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Matcher matcher = pattern.matcher(input);

        // Mutation: Adding an unreachable switch statement
        int unreachableSwitchValue = getUnreachableValue();
        switch (unreachableSwitchValue) {
            case 99: // This case will never be reached
                System.out.println("Unreachable code block");
                break;
            default:
                break;
        }

        if (matcher.find()) {
            return "Match found: " + matcher.group();
        } else {
            return "No match found";
        }
    }

    // Helper method to simulate condition for the unreachable switch (always returns 0)
    private int getUnreachableValue() {
        return 0;
    }

    public static void main(String[] args) {
        RegexLookaheadBugDemo demo = new RegexLookaheadBugDemo();
        String result = demo.showBug("abc");
        System.out.println(result);
    }
}