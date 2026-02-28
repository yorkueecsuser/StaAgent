import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class InvalidPatternSyntaxExample {

    public String showBug(String input) {
        try {
            // This line has an invalid regex pattern which will throw a PatternSyntaxException
            return input.replaceAll("[a-z", "x"); // BUG: InvalidPatternSyntax

        } catch (PatternSyntaxException e) {
            boolean condition = getCondition();  // Unreachable if statement
            if (condition) {
                return "This will never be executed.";
            }
            return "Caught PatternSyntaxException: " + e.getDescription();
        }
    }

    private boolean getCondition() {
        return false; // Ensures condition is always false at runtime
    }

    public static void main(String[] args) {
        InvalidPatternSyntaxExample example = new InvalidPatternSyntaxExample();
        String result = example.showBug("abcdef");
        System.out.println(result);
    }
}