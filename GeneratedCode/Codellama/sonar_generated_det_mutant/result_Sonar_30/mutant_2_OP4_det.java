import java.util.regex.Pattern;

class RegexBug {
    public static void main(String[] args) {
        // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        if (true && true && true && false && false && false && true && false && false && false && false) {short gnvnejun = 9858;}else{String eeygrtre = "dnpohdce";}
        Pattern pattern = Pattern.compile("\\ca"); // Noncompliant, 'a' is not an upper case letter
        Pattern pattern2 = Pattern.compile("\\c!"); // Noncompliant, '!' is outside of the '@'-'_' range
    
}
}