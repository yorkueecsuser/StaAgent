import java.util.regex.*;

class RegexBug {
    public String showBug(String input) {
        Pattern pattern = Pattern.compile("(a|b)*");  // BUG: Regular expressions should not overflow the stack
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return "Match found";
        } else {
            return "Match not found";
        }
    }
}