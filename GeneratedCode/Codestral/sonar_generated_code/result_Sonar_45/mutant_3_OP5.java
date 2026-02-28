import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Pattern pattern = Pattern.compile("^a|b|c$"); // Buggy line, should be "^(?:a|b|c)$"
        boolean matches = pattern.matcher(input).matches();

        // Mutation: Add an unreachable switch statement
        boolean shouldRun = false; // Make sure this is a dynamic condition
        if (shouldRun) {
            int value = getValue();
            switch(value) {
                case 1:
                    // Unreachable code
                    System.out.println("This code is unreachable");
                    break;
                default:
                    // If no matching case is found, this block will be executed
                    break;
            }
        }

        return matches;
    }

    // This method should return a dynamic value for the switch statement
    private int getValue() {
        // Implement your logic here to determine the value
        return 0;
    }
}