import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexEmptyStringBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?:x?)*");
        Matcher matcher = pattern.matcher(input);

        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This code will never be reached due to the unreachable switch condition.");
                break;
        }

        return matcher.matches();
    }

    private int getUnreachableValue() {
        return -1;
    }
}