import java.util.regex.Pattern;
import java.util.regex.Matcher;

class InvalidPatternSyntax {
    public static void main(String[] args) {
        String input = "abc";
        String regex = "*"; // BUG: InvalidPatternSyntax
        Matcher matcher = Pattern.compile(regex).matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        // Unreachable switch statement mutation
        int value = getValue();
        switch (value) {
            case 1:
                // code that is never executed
                break;
        }
    }

    private static int getValue() {
        return 0;
    }
}