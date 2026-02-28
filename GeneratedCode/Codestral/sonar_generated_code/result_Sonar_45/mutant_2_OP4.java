import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Pattern pattern = Pattern.compile("^a|b|c$"); // Buggy line, should be "^(?:a|b|c)$"

        if (getFalseCondition()) { // Unreachable if-else block
            System.out.println("This line is unreachable");
        } else {
            // Original code
            return pattern.matcher(input).matches();
        }
    }

    private boolean getFalseCondition() {
        return false; // Method always returns false
    }
}