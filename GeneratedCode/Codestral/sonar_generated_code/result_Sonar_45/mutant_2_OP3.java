import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        // Original code
        Pattern pattern = Pattern.compile("^a|b|c$"); // Buggy line, should be "^(?:a|b|c)$"
        boolean matches = pattern.matcher(input).matches();

        // Introducing unreachable if branch
        boolean unreachableCondition = isUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        }

        return matches;
    }

    private boolean isUnreachableCondition() {
        // This method returns false to ensure the condition is always unreachable
        return false;
    }
}