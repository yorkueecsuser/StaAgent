import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBoundaryBug {

    public String showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Pattern patternCopy = Pattern.compile("$[a-z]+^"); // DUPLICATION: Duplicate of the pattern assignment
        Matcher matcher = pattern.matcher(input);
        Matcher matcherCopy = pattern.matcher(input); // DUPLICATION: Duplicate of the matcher assignment
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match found";
    }

    public static void main(String[] args) {
        RegexBoundaryBug bugDemo = new RegexBoundaryBug();
        RegexBoundaryBug bugDemoCopy = new RegexBoundaryBug(); // DUPLICATION: Duplicate of the bugDemo assignment
        System.out.println(bugDemo.showBug("example"));
    }
}