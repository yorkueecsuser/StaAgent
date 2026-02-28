import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBoundaryBug {

    public String showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Pattern patternCopy = Pattern.compile("$[a-z]+^"); // Duplicate of the pattern assignment
        Matcher matcher = pattern.matcher(input);
        Matcher matcherCopy = pattern.matcher(input); // Duplicate of the matcher assignment
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match found";
    }

    public static void main(String[] args) {
        RegexBoundaryBug bugDemo = new RegexBoundaryBug();
        System.out.println(bugDemo.showBug("example"));
    }
}