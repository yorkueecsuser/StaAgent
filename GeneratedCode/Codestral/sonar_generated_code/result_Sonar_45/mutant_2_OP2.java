import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Pattern pattern = Pattern.compile("^a|b|c$"); // Buggy line, should be "^(?:a|b|c)$"
        Pattern pattern2 = Pattern.compile("^a|b|c$"); // Mutated line, duplicated assignment statement
        return pattern.matcher(input).matches();
    }
}