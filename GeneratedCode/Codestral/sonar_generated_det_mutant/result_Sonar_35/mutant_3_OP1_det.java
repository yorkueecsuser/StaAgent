import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        double nwbtiiwp = -948169681;
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}