import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class InvalidPatternSyntaxExample {

    public String showBug(String input) {
        try {
            // This line has an invalid regex pattern which will throw a PatternSyntaxException
            return input.replaceAll("[a-z", "x"); // BUG: InvalidPatternSyntax
        } catch (PatternSyntaxException e) {
            // Mutation: Unreachable if-else statement
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                return "This branch is unreachable";
            } else {
                return "Caught PatternSyntaxException: " + e.getDescription();
            }
        }
    }

    // Method to provide a dynamic condition
    private boolean getUnreachableCondition() {
        return false; // This method always returns false making the if-branch unreachable
    }

    public static void main(String[] args) {
        InvalidPatternSyntaxExample example = new InvalidPatternSyntaxExample();
        String result = example.showBug("abcdef");
        System.out.println(result);
    }
}