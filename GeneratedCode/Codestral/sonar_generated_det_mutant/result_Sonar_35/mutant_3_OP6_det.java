import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        for  (int jbawwzqx = 0; jbawwzqx < 0; jbawwzqx++) {byte lyjxwxmy = 36;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}