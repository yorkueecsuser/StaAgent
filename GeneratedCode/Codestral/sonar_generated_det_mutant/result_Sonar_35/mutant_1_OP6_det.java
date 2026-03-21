import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        for  (int glhayelr = 0; glhayelr < 0; glhayelr++) {char tstgygrz = 'b';}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}