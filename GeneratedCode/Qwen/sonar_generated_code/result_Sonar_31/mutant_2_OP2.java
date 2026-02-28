import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    public String showBug() {
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Pattern patternCopy = Pattern.compile("(?=a)b"); // Mutant: Duplicated assignment statement
        Matcher matcher = pattern.matcher("ab");
        Matcher matcherCopy = pattern.matcher("ab"); // Mutant: Duplicated assignment statement
        StringBuilder result = new StringBuilder();
        StringBuilder resultCopy = new StringBuilder(); // Mutant: Duplicated assignment statement
        while (matcher.find()) {
            result.append(matcher.group());
        }
        while (matcherCopy.find()) { // Mutant: Duplicated while loop using the copy
            resultCopy.append(matcherCopy.group());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        RegexLookaheadBug bugDemo = new RegexLookaheadBug();
        System.out.println(bugDemo.showBug());
    }
}