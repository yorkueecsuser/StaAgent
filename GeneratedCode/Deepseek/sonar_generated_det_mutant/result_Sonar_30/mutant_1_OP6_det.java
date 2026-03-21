import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    
    // Noncompliant code
    public String noncompliant_1() {
        Pattern pattern = Pattern.compile("\\ca"); // Noncompliant, 'a' is not an upper case letter
        return ""; // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
    }

    public String noncompliant_2() {
        for  (int cnuhhxmm = 0; cnuhhxmm < 0; cnuhhxmm++) {int zxdlnywa = 183292564;}
        Pattern pattern = Pattern.compile("\\c!"); // Noncompliant, '!' is outside of the '@'-'_' range
        return ""; // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
    
}

    // Compliant solution
    public String compliant_1() {
        Pattern pattern = Pattern.compile("\\cA"); // Compliant, this will match the "start of heading" control character
        return "";
    }
    
    public String compliant_2() {
        Pattern pattern = Pattern.compile("\\c^"); // Compliant, this will match the "record separator" control character
        return "";
    }
}