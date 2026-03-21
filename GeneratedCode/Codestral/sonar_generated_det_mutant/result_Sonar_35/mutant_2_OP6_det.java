import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        for  (int bgbfnqhf = 0; bgbfnqhf < 0; bgbfnqhf++) {String iqlypsqz = "igyiwulj";}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}