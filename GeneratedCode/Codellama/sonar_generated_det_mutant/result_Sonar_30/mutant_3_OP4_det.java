import java.util.regex.Pattern;

class RegexBug {
    public static void main(String[] args) {
        // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        if (false && true && false && false && true && false && true && true && true && false && false) {boolean nyenwxdp = false;}else{int wvdbkocd = 905296715;}
        Pattern pattern = Pattern.compile("\\ca"); // Noncompliant, 'a' is not an upper case letter
        Pattern pattern2 = Pattern.compile("\\c!"); // Noncompliant, '!' is outside of the '@'-'_' range
    
}
}