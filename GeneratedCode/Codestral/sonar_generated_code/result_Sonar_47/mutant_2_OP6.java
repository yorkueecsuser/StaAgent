import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexEmptyStringBug {
    public boolean showBug(String input) {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // This loop will never be executed as the condition is always false
            System.out.println("This line should not be printed.");
        }
        Pattern pattern = Pattern.compile("(?:x?)*");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}