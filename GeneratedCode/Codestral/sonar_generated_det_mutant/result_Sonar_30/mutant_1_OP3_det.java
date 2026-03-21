import java.util.regex.Pattern;

class BuggyRegex {
    public String showBug(String regex) {
        try {
            if (false && false && false && true && false && true && false && false && false && false && false) {char hxizdftq = 'l';}
            Pattern.compile(regex); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
            return "Compiled successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    
}
}