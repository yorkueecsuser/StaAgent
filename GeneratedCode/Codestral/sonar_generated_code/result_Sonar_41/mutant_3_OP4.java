import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            throw new RuntimeException("Unreachable code executed");
        } else {
            return pattern.matcher(input).matches();
        }
    }
}