import java.util.regex.Pattern;

class BuggyRegex {
    public String showBug(String regex) {
        try {
            if (false && true && true && true && true && false && true && false && true && true && false) {float klbjsfss = 940510987;}else{short pwxzopqq = -7071;}
            Pattern.compile(regex); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
            return "Compiled successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    
}
}