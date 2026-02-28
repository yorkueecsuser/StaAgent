import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexEmptyStringBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?:x?)*");
        Matcher matcher = pattern.matcher(input);

        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code block is unreachable
            System.out.println("This is an unreachable while loop");
        }

        return matcher.matches();
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the while loop unreachable
        return false;
    }
}