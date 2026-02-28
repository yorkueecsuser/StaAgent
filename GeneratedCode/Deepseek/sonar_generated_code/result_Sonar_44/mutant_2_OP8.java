import java.util.regex.*;

class RegexBug {

    public String showBug(String regex, String input) {
        Pattern patt = Pattern.compile(regex);
        Matcher match = patt.matcher(input);

        if (match.find()) {
            return match.group();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        System.out.println(bug.showBug("[ab]|a", "a")); // BUG: Regex alternatives should not be redundant
        System.out.println(bug.showBug(".*|a", "anything")); // BUG: Regex alternatives should not be redundant
    }
}