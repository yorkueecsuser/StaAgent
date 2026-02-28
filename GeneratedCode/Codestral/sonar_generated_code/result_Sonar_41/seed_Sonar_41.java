import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE); // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        return pattern.matcher(input).matches();
    }
}