import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class InvalidPatternSyntaxExample {

    public String showBug(String input) {
        try {
            // This line has an invalid regex pattern which will throw a PatternSyntaxException
            String result = input.replaceAll("[a-z", "x"); // BUG: InvalidPatternSyntax
            // Duplicate the assignment statement without method invocation side effect
            result = input.replaceAll("[a-z", "x");
            return result;
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