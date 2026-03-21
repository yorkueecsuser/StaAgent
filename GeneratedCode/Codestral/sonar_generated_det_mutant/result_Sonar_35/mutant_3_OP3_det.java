import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        if (false && true && false && true && false && false && false && false && true && true && false) {float oflapwfm = -178759753;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}