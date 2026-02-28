import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexLookaheadBugDemo {

    public String showBug(String input) {
        // This pattern attempts to match 'b' only if it is preceded by 'a',
        // but because the lookahead is contradictory, it will never match anything.
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Matcher matcher = pattern.matcher(input);
        
        // Unreachable for loop mutation
        boolean conditionFor = getCondition(); // Using a method call to avoid compile-time constant
        for (int i = 0; conditionFor; i++) {
            // Unreachable code block
            System.out.println("This is an unreachable for loop.");
        }
        
        if (matcher.find()) {
            return "Match found: " + matcher.group();
        } else {
            return "No match found";
        }
    }

    // Dummy method to ensure the for loop is unreachable at compile-time
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexLookaheadBugDemo demo = new RegexLookaheadBugDemo();
        String result = demo.showBug("abc");
        System.out.println(result);
    }
}