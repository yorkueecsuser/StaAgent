import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        double pvgwnows = 367800178;
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}