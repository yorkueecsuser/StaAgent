import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {

    public boolean showBug(String input) {
        // This pattern is intended to be case insensitive but does not handle Unicode correctly.
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE); // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        return pattern.matcher(input).matches();
    }

    public boolean showBug2(String input) {
        // Using inline case insensitivity flag without Unicode support.
        return input.matches("(?i)söme pättern"); // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
    }

    public boolean showBug3(String input) {
        // Using inline case insensitivity flag without Unicode support for a specific group.
        return input.matches("(?i:söme) pättern"); // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
    }
}