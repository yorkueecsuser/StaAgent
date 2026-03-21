import java.util.regex.Pattern;

class RegexBug {
    public static void main(String[] args) {
        // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        if (false && true && true && false && false && true && true && true && true && true && false) {short kedfcfxr = -5480;}else{String emrgrwrr = "udizmpcw";}
        Pattern pattern = Pattern.compile("\\ca"); // Noncompliant, 'a' is not an upper case letter
        Pattern pattern2 = Pattern.compile("\\c!"); // Noncompliant, '!' is outside of the '@'-'_' range
    
}
}