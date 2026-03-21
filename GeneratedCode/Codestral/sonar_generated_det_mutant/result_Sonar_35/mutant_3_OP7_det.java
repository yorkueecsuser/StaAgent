import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        boolean lubmcfmq = false;while (lubmcfmq && false && true && false && false && false && false && false && false && true && false && false) {short nmrsdshv = 4152;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}