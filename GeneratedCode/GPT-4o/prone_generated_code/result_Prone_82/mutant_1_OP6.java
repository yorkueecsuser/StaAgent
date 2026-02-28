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

    public static void main(String[] args) {
        InvalidPatternSyntaxExample example = new InvalidPatternSyntaxExample();
        String result = example.showBug("abcdef");
        System.out.println(result);
        
        // Unreachable for loop mutant
        boolean conditionFor = getCondition(); // Use a non-final variable
        for (int i = 0; conditionFor; i++) {
            System.out.println("This for loop is unreachable");
        }
    }
    
    // Helper method to simulate a false condition
    private static boolean getCondition() {
        return false;
    }
}