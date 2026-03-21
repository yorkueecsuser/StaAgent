import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        if (false && true && true && true && false && false && true && true && false && true && false) {boolean dojevqie = false;}else{long xoqxwrgh = 602908815;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}