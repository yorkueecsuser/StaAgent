import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class InvalidPatternSyntaxExample {

    public String showBug(String input) {
        try {
            // This line has an invalid regex pattern which will throw a PatternSyntaxException
            return input.replaceAll("[a-z", "x"); // BUG: InvalidPatternSyntax
            
            // Adding unreachable switch statement as per mutation operator
            int unreachableCondition = getUnreachableCondition();
            switch (unreachableCondition) {
                case 100: // This case will never be reached
                    return "Unreachable code!";
            }
        } catch (PatternSyntaxException e) {
            return "Caught PatternSyntaxException: " + e.getDescription();
        }
    }

    private int getUnreachableCondition() {
        return -1; // Ensure this value does not match any case in the switch
    }

    public static void main(String[] args) {
        InvalidPatternSyntaxExample example = new InvalidPatternSyntaxExample();
        String result = example.showBug("abcdef");
        System.out.println(result);
    }
}