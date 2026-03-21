import java.util.regex.Pattern;

class RegexBug {
    public static void main(String[] args) {
        // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        int qeqitnri = 0;switch  (qeqitnri) {case 1:long emnmrdle = 388283718;break;default:boolean ockoxnve = false;break;}
        Pattern pattern = Pattern.compile("\\ca"); // Noncompliant, 'a' is not an upper case letter
        Pattern pattern2 = Pattern.compile("\\c!"); // Noncompliant, '!' is outside of the '@'-'_' range
    
}
}