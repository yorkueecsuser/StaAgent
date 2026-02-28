import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexEmptyStringBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?:x?)*");
        Matcher matcher = pattern.matcher(input);
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code
            return false;
        }
        return matcher.matches();
    }

    private boolean getCondition() {
        return false; // Always return false to make the if statement unreachable
    }
}