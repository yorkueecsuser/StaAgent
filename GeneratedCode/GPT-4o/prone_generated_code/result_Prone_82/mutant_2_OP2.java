import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class InvalidPatternSyntaxExample {

    public String showBug(String input) {
        try {
            // This line has an invalid regex pattern which will throw a PatternSyntaxException
            String replacedInput = input.replaceAll("[a-z", "x"); // BUG: InvalidPatternSyntax
            replacedInput = input.replaceAll("[a-z", "x"); // Duplicate assignment statement
            return replacedInput;
        } catch (PatternSyntaxException e) {
            return "Caught PatternSyntaxException: " + e.getDescription();
        }
    }

    public static void main(String[] args) {
        InvalidPatternSyntaxExample example = new InvalidPatternSyntaxExample();
        String result = example.showBug("abcdef");
        System.out.println(result);
    }
}