import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class InvalidPatternSyntaxExample {

    public String showBug(String input) {
        try {
            // This line has an invalid regex pattern which will throw a PatternSyntaxException
            return input.replaceAll("[a-z", "x"); // BUG: InvalidPatternSyntax
        } catch (PatternSyntaxException e) {
            // Unreachable switch statement mutant added
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    return "Unreachable case 1";
                case 2:
                    return "Unreachable case 2";
                default:
                    return "Unreachable default case";
            }
            return "Caught PatternSyntaxException: " + e.getDescription();
        }
    }

    // Method to always return a value not in the switch cases
    private int getUnreachableValue() {
        return 3; // Ensures the switch statement is unreachable
    }

    public static void main(String[] args) {
        InvalidPatternSyntaxExample example = new InvalidPatternSyntaxExample();
        String result = example.showBug("abcdef");
        System.out.println(result);
    }
}