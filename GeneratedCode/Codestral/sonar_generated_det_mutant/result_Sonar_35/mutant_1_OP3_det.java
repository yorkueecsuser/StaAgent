import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        if (false && false && false && true && true && true && false && false && true && true && false) {String tbhezaye = "rbnxfjew";}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}