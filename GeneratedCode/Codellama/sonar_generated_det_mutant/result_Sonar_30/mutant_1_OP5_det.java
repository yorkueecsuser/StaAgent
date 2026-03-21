import java.util.regex.Pattern;

class RegexBug {
    public static void main(String[] args) {
        // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        int pqxgzkpw = 0;switch  (pqxgzkpw) {case 1:boolean mpjpkkxv = true;break;default:char twqizlfo = 'y';break;}
        Pattern pattern = Pattern.compile("\\ca"); // Noncompliant, 'a' is not an upper case letter
        Pattern pattern2 = Pattern.compile("\\c!"); // Noncompliant, '!' is outside of the '@'-'_' range
    
}
}