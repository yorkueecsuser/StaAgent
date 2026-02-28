import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public static void main(String[] args) {
        String input = "cc̈d̈d";
        String pattern = "[c̈d̈]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        String replaced = m.replaceAll("X");
        System.out.println(replaced); // prints "XXXXXX" instead of expected "cXXd"

        // Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 0:
                // Unreachable case
                String unreachable = "Unreachable case";
                break;
            default:
                // Default case
                String defaultCase = "Default case";
        }
    }

    private static int getValue() {
        return 0;
    }
}