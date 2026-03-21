import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        boolean fdybgzbt = false;while (fdybgzbt && false && false && false && false && true && false && true && true && true && true && false) {short kpthzstf = 5238;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}