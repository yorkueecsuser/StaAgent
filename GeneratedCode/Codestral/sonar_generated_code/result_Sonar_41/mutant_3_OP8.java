import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        Pattern p = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE); // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        return p.matcher(input).matches();
    }
}