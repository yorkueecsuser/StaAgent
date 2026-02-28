import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class InvalidPatternSyntaxExample {

    public String showBug(String input) {
        try {
            // This line has an invalid regex pattern which will throw a PatternSyntaxException
            return input.replaceAll("[a-z", "x"); // BUG: InvalidPatternSyntax
        } catch (PatternSyntaxException e) {
            return "Caught PatternSyntaxException: " + e.getDescription();
        } finally {
            // Adding an unreachable switch statement based on a non-final variable
            int unreachableSwitchValue = getUnreachableSwitchValue();
            switch (unreachableSwitchValue) {
                case 1: // This case will never be hit since unreachableSwitchValue is always 0
                    System.out.println("This is an unreachable switch case.");
                    break;
            }
        }
    }

    private int getUnreachableSwitchValue() {
        // The method always returns 0, making the switch case unreachable
        return 0;
    }

    public static void main(String[] args) {
        InvalidPatternSyntaxExample example = new InvalidPatternSyntaxExample();
        String result = example.showBug("abcdef");
        System.out.println(result);
    }
}