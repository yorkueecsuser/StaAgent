import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    }

    public static void main(String[] args) {
        RegexPossessiveBug bug = new RegexPossessiveBug();
        System.out.println(bug.showBug("aaabc"));
    }
}