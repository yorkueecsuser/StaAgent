import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class InvalidPatternSyntaxExample {

    public String showBug(String input) {
        try {
            // This line has an invalid regex pattern which will throw a PatternSyntaxException
            return input.replaceAll("[a-z", "x"); // BUG: InvalidPatternSyntax

            // Mutation: Unreachable if-else statement with a dynamically determined condition
            boolean condition = getCondition(); // This is a dynamically determined condition
            if (condition) {
                // This block will never be reached as the condition always evaluates to false
                return "Unreachable code";
            } else {
                // This block is reachable
                return "This is the else block.";
            }
        } catch (PatternSyntaxException e) {
            return "Caught PatternSyntaxException: " + e.getDescription();
        }
    }

    // Method to dynamically determine the condition, always returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        InvalidPatternSyntaxExample example = new InvalidPatternSyntaxExample();
        String result = example.showBug("abcdef");
        System.out.println(result);
    }
}