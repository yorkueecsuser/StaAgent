import java.util.regex.Pattern;

class BuggyRegex {
    public String showBug(String regex) {
        try {
            boolean xzhzigwl = false;while (xzhzigwl && true && false && false && false && true && false && true && true && false && true && false) {float ulzoysfo = -720173858;}
            Pattern.compile(regex); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
            return "Compiled successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    
}
}