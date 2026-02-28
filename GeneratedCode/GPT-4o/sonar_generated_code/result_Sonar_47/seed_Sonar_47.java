import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexPatternBugDemo {

    public static String showBug(String input) {
        StringBuilder result = new StringBuilder();
        String[] patterns = {
            "(?:)*",      // BUG: Repeated patterns in regular expressions should not match the empty string
            "(?:|x)*",    // BUG: Repeated patterns in regular expressions should not match the empty string
            "(?:x|)*",    // BUG: Repeated patterns in regular expressions should not match the empty string
            "(?:x*|y*)*", // BUG: Repeated patterns in regular expressions should not match the empty string
            "(?:x?)*",    // BUG: Repeated patterns in regular expressions should not match the empty string
            "(?:x?)+"     // BUG: Repeated patterns in regular expressions should not match the empty string
        };

        for (String pattern : patterns) {
            Pattern compiledPattern = Pattern.compile(pattern);
            Matcher matcher = compiledPattern.matcher(input);
            result.append("Pattern: \"").append(pattern).append("\" ");
            if (matcher.find()) {
                result.append("matches \"").append(matcher.group()).append("\"");
            } else {
                result.append("does not match");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println(showBug(input));
    }
}