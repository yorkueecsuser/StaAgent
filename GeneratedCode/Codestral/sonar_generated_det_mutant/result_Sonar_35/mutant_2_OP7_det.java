import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        boolean zetgfmic = false;while (zetgfmic && true && false && false && true && true && true && true && true && true && true && false) {boolean pftnlsol = true;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}