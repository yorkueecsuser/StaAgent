import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Pattern pattern = Pattern.compile("^a|b|c$"); // Buggy line, should be "^(?:a|b|c)$"

        // Mutant: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("Unreachable code block");
        }

        return pattern.matcher(input).matches();
    }

    private boolean getCondition() {
        // This method always returns false to ensure the while loop is unreachable
        return false;
    }
}