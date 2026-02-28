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
    
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexLookaheadBugDemo demo = new RegexLookaheadBugDemo();
        String result = demo.showBug("abc");
        System.out.println(result);
        
        // Unreachable switch statement
        int testValue = demo.getValue();
        switch (testValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                // This is the default case and will be selected if testValue is not 1
                break;
        }
    }
    
    private int getValue() {
        // This method returns a value that will ensure the switch case is unreachable
        return 0; // Using a method to avoid using a compile-time constant directly
    }
}