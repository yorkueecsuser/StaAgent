import java.util.regex.Pattern;

class BuggyRegex {
    public String showBug(String regex) {
        try {
            boolean uqocsrvi = false;while (uqocsrvi && true && false && true && true && true && true && true && false && false && true && false) {char wuplrmen = 't';}
            Pattern.compile(regex); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
            return "Compiled successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    
}
}