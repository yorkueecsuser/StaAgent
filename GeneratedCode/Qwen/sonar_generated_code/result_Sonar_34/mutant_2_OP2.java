import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBoundaryBug {

    public String showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Pattern patternCopy = Pattern.compile("$[a-z]+^"); // Duplicate assignment of pattern
        Matcher matcher = pattern.matcher(input);
        Matcher matcherCopy = pattern.matcher(input); // Duplicate assignment of matcher
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match found";
    }

    public static void main(String[] args) {
        RegexBoundaryBug bugDemo = new RegexBoundaryBug();
        RegexBoundaryBug bugDemoCopy = new RegexBoundaryBug(); // Duplicate assignment of bugDemo
        System.out.println(bugDemo.showBug("example"));
    }
}