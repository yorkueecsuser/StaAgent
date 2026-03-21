import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegexBug {
    public static void main(String[] args) {
        // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        boolean sdowrodx = false;while (sdowrodx && true && true && false && false && true && false && true && true && true && false && false) {double zuqoosup = -513742268;}
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE);
        String str = "Söme Pättern";
        System.out.println(pattern.matcher(str).matches()); // Outputs "false", should be "true"
    
}
}