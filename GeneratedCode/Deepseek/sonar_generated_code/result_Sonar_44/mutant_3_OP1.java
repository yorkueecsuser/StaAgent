import java.util.regex.*;

class RegexBug {

    public String showBug(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            return matcher.group();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        String deadStore1 = "deadStore1"; // Dead Store Mutant
        System.out.println(bug.showBug("[ab]|a", "a")); // BUG: Regex alternatives should not be redundant
        System.out.println(bug.showBug(".*|a", "anything")); // BUG: Regex alternatives should not be redundant
    }
}