import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        if (true && true && false && false && false && false && true && false && true && false && false) {short wqyyvdxv = -4953;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}