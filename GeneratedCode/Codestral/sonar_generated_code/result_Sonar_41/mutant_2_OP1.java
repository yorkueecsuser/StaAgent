import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        String deadStore = "uselessVar"; // Inserted dead store
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE); // Fixed the bug by adding UNICODE_CASE flag
        return pattern.matcher(input).matches();
    }
}