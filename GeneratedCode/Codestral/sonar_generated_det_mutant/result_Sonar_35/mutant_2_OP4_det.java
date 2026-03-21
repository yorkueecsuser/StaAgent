import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        if (false && false && true && true && false && false && true && false && true && true && false) {String dkmokwyn = "yrmzuisb";}else{byte bbffsdgw = -104;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}