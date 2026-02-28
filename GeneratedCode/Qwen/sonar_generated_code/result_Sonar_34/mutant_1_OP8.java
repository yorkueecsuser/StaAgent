import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBoundaryBug {

    public String showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match found";
    }

    public static void main(String[] args) {
        RegexBoundaryBug bugDemo = new RegexBoundaryBug();
        System.out.println(bugDemo.showBug("example"));

        // Mutant code
        Pattern q = Pattern.compile("$[a-z]+^");
        Matcher r = q.matcher(input);
        if (r.find()) {
            return r.group();
        }
        return "No match found";
    }
}