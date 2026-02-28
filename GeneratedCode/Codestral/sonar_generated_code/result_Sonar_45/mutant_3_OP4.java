import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Pattern pattern = Pattern.compile("^a|b|c$"); // Buggy line, should be "^(?:a|b|c)$"

        // Mutant code: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch should never be executed
        } else {
            System.out.println("Unreachable code executed. This is a mutant.");
        }

        return pattern.matcher(input).matches();
    }

    private boolean getCondition() {
        // This method always returns false, making the if branch unreachable
        return false;
    }
}