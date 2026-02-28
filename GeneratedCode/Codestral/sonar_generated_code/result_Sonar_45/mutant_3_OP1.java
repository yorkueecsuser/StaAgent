import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Pattern pattern = Pattern.compile("^a|b|c$"); // Buggy line, should be "^(?:a|b|c)$"

        // Added dead store
        String unusedVariable = "deadstore";

        return pattern.matcher(input).matches();
    }
}