import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegexBug {
    public static void main(String[] args) {
        // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE);
        String zgcssjlj = "Söme Pättern";
        System.out.println(pattern.matcher(zgcssjlj).matches()); // Outputs "false", should be "true"
    }
}