import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexEmptyStringBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?:x?)*");
        Matcher matcher = pattern.matcher(input);

        if (unreachableCondition()) { // Unreachable if statement mutation
            System.out.println("This line is unreachable");
        }

        return matcher.matches();
    }

    private boolean unreachableCondition() {
        return false; // Always returns false, making the if statement unreachable
    }
}