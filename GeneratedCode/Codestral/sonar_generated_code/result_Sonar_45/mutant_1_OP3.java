import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        // Original line
        Pattern pattern = Pattern.compile("^a|b|c$"); // Buggy line, should be "^(?:a|b|c)$"

        // Mutation Operator: Unreachable if statement
        // Adding unreachable if statement with a dynamically determined condition
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never be executed because'shouldRun' is always false
            System.out.println("This line should never be executed.");
        }

        return pattern.matcher(input).matches();
    }

    // Method to dynamically determine the condition
    private boolean getCondition() {
        return false;
    }
}