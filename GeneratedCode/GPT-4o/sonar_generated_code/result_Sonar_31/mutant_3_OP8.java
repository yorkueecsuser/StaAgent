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

    public static void main(String[] args) {
        RegexLookaheadBugDemo demo = new RegexLookaheadBugDemo();
        String result = demo.showBug("abc");
        System.out.println(result);
    }
}

// Mutant code
class RenamedVariableDemo {

    public String showBug(String x) {
        // This pattern attempts to match 'b' only if it is preceded by 'a',
        // but because the lookahead is contradictory, it will never match anything.
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Matcher matcher = pattern.matcher(x);
        
        if (matcher.find()) {
            return "Match found: " + matcher.group();
        } else {
            return "No match found";
        }
    }

    public static void main(String[] args) {
        RenamedVariableDemo z = new RenamedVariableDemo();
        String y = z.showBug("abc");
        System.out.println(y);
    }
}