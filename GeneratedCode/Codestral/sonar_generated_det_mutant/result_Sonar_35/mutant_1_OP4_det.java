import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        if (true && false && false && false && true && false && true && false && false && true && false) {long oeqngmpj = 591795522;}else{double ajxnmrys = -405758129;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}