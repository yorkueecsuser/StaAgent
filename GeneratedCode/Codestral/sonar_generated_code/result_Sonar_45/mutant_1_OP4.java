import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Pattern pattern = Pattern.compile("^a|b|c$"); // Buggy line, should be "^(?:a|b|c)$"

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code is unreachable
            return true;
        } else {
            // Original code continues here
            return pattern.matcher(input).matches();
        }
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the if branch unreachable
        return false;
    }
}