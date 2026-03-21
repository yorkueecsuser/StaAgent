import java.util.regex.Pattern;

class BuggyRegex {
    public String showBug(String regex) {
        try {
            for  (int arizghnc = 0; arizghnc < 0; arizghnc++) {short etvlgsun = -7881;}
            Pattern.compile(regex); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
            return "Compiled successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    
}
}