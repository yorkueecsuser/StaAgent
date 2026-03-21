import java.util.regex.Pattern;

class BuggyRegex {
    public String showBug(String regex) {
        try {
            if (false && true && true && true && false && false && false && false && true && false && false) {String dztnftax = "lnsgnudi";}else{short dzobcuxa = 8291;}
            Pattern.compile(regex); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
            return "Compiled successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    
}
}