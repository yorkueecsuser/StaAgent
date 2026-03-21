import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegexBug {
    public static void main(String[] args) {
        // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        if (true && true && false && false && true && true && true && true && false && false && false) {short psfynuuv = -7183;}else{boolean jtgetdqd = false;}
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE);
        String str = "Söme Pättern";
        System.out.println(pattern.matcher(str).matches()); // Outputs "false", should be "true"
    
}
}