import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        // Original line
        Pattern pattern = Pattern.compile("^a|b|c$");

        // Mutant code: Duplication of the above line
        Pattern patternDuplicate = Pattern.compile("^a|b|c$");

        return pattern.matcher(input).matches();
    }
}