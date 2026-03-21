import java.util.regex.Pattern;

class BuggyRegex {
    public String showBug(String regex) {
        try {
            if (true && true && false && true && true && true && true && false && false && true && false) {byte jgmtnoqa = -61;}
            Pattern.compile(regex); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
            return "Compiled successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    
}
}