import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class InvalidPatternSyntaxExample {

    public String showBug(String input) {
        // Adding a method to provide a condition that is always false
        boolean alwaysFalseCondition = getAlwaysFalseCondition();
        if (alwaysFalseCondition) {
            // This block is unreachable but doesn't cause a compile-time error
            System.out.println("This block is unreachable.");
        }
        
        try {
            // This line has an invalid regex pattern which will throw a PatternSyntaxException
            return input.replaceAll("[a-z", "x"); // BUG: InvalidPatternSyntax
        } catch (PatternSyntaxException e) {
            return "Caught PatternSyntaxException: " + e.getDescription();
        }
    }
    
    // Method to ensure the condition is always false at runtime
    private boolean getAlwaysFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        InvalidPatternSyntaxExample example = new InvalidPatternSyntaxExample();
        String result = example.showBug("abcdef");
        System.out.println(result);
    }
}