import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class InvalidPatternSyntaxExample {

    public String showBug(String input) {
        try {
            // This line has an invalid regex pattern which will throw a PatternSyntaxException
            return input.replaceAll("[a-z", "x"); // BUG: InvalidPatternSyntax
        } catch (PatternSyntaxException e) {
            return "Caught PatternSyntaxException: " + e.getDescription();
        }
    }

    // Mutated method with renamed variable
    public String showBugMutant(String z) {
        try {
            // This line has an invalid regex pattern which will throw a PatternSyntaxException
            return z.replaceAll("[a-z", "x"); // BUG: InvalidPatternSyntax
        } catch (PatternSyntaxException f) {
            return "Caught PatternSyntaxException: " + f.getDescription();
        }
    }

    public static void main(String[] args) {
        InvalidPatternSyntaxExample example = new InvalidPatternSyntaxExample();
        String result = example.showBug("abcdef");
        System.out.println(result);

        // Test mutated method
        String resultMutant = example.showBugMutant("abcdef");
        System.out.println(resultMutant);
    }
}