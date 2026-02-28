import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexEmptyStringBug {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?:x?)*");
        Matcher matcher = pattern.matcher(input);

        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }

        return matcher.matches();
    }
}