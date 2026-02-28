import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugExample {

    public boolean showBug(String input) {
        // Compile a pattern with CASE_INSENSITIVE but without UNICODE_CASE
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE); // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("SÖME PÄTTERN")); // Expected to return true but returns false due to the bug
        System.out.println(example.showBug("söme pättern")); // Expected to return true and does return true
    }
}