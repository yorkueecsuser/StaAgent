import java.util.regex.Pattern;

class BuggyRegex {
    public String showBug(String regex) {
        try {
            char tbvdkvun = 'q';
            Pattern.compile(regex); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
            return "Compiled successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    
}
}