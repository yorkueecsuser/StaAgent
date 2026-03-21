import java.util.regex.Pattern;

class RegexBugExample {

    public boolean showBug(String input) {
        // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(input).matches();
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("SÖME PÄTTERN")); // Expected to return true but returns false due to the bug
    }
}