import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    public String showBug() {
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Pattern patternCopy = Pattern.compile("(?=a)b"); // DUPLICATION: Duplicate of the pattern assignment
        Matcher matcher = pattern.matcher("ab");
        Matcher matcherCopy = pattern.matcher("ab"); // DUPLICATION: Duplicate of the matcher assignment
        StringBuilder result = new StringBuilder();
        StringBuilder resultCopy = new StringBuilder(); // DUPLICATION: Duplicate of the result assignment
        while (matcher.find()) {
            result.append(matcher.group());
        }
        while (matcherCopy.find()) { // DUPLICATION: Duplicate of the while loop
            resultCopy.append(matcherCopy.group());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        RegexLookaheadBug bugDemo = new RegexLookaheadBug();
        System.out.println(bugDemo.showBug());
    }
}