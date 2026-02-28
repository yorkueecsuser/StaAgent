import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexLookaheadBugDemo {

    public String showBug(String input) {
        // This pattern attempts to match 'b' only if it is preceded by 'a',
        // but because the lookahead is contradictory, it will never match anything.
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Pattern patternDuplicate = Pattern.compile("(?=a)b"); // Duplicated assignment

        Matcher matcher = pattern.matcher(input);
        Matcher matcherDuplicate = pattern.matcher(input); // Duplicated assignment
        
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