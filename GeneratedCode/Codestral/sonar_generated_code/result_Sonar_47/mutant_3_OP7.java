import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexEmptyStringBug {
    public boolean showBug(String input) {
        boolean conditionWhile = getCondition(); // Get a condition dynamically
        while (conditionWhile) { // Use a dynamic condition instead of a compile-time constant
            // This loop is unreachable as conditionWhile is always false
            // Mutant code added here
        }

        Pattern pattern = Pattern.compile("(?:x?)*");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    private boolean getCondition() {
        // This method always returns false
        // This ensures the while loop is unreachable
        return false;
    }
}