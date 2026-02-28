import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class InvalidPatternSyntaxExample {

    public String showBug(String input) {
        try {
            // This line has an invalid regex pattern which will throw a PatternSyntaxException
            return input.replaceAll("[a-z", "x"); // BUG: InvalidPatternSyntax
        } catch (PatternSyntaxException e) {
            // Begin mutant insertion
            boolean unreachableCondition = getFalseCondition();
            while (unreachableCondition) {
                System.out.println("This is unreachable code");
            }
            // End mutant insertion
            return "Caught PatternSyntaxException: " + e.getDescription();
        }
    }
    
    // Helper method to ensure the while loop condition is not a compile-time constant
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        InvalidPatternSyntaxExample example = new InvalidPatternSyntaxExample();
        String result = example.showBug("abcdef");
        System.out.println(result);
    }
}