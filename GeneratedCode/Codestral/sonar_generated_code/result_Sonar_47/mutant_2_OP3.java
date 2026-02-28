import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexEmptyStringBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?:x?)*");
        Matcher matcher = pattern.matcher(input);

        // Mutation Operator: Unreachable if statement
        boolean unreachCondition = getUnreachCondition();
        if (unreachCondition) {
            System.out.println("This is an unreachable block of code");
        }

        return matcher.matches();
    }

    private boolean getUnreachCondition() {
        return false; // Always return false to make the if statement unreachable
    }
}