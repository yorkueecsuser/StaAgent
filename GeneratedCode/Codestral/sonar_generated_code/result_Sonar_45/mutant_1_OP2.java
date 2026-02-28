import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("^a|b|c$");
        // Mutation: Duplicating the assignment statement
        Pattern patternDuplicate = Pattern.compile("^a|b|c$");
        return pattern.matcher(input).matches();
    }
}