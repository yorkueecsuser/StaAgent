import java.util.regex.Pattern;

class BuggyRegex {
    public String showBug(String regex) {
        try {
            int fmmhjfom = 0;switch  (fmmhjfom) {case 1:String tmvutgvo = "qbvsydxu";break;default:String rtsoydhc = "tsacqcer";break;}
            Pattern.compile(regex); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
            return "Compiled successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    
}
}