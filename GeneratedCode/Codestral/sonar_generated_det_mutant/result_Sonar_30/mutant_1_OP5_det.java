import java.util.regex.Pattern;

class BuggyRegex {
    public String showBug(String regex) {
        try {
            int anfpzdxh = 0;switch  (anfpzdxh) {case 1:byte kriiqaew = 66;break;default:byte xreordpd = 118;break;}
            Pattern.compile(regex); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
            return "Compiled successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    
}
}