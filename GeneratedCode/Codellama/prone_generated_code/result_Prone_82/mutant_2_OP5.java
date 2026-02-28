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
    }

    // Unreachable switch statement mutant
    public static void main(String[] args) {
        String input = "abc";
        String regex = "*"; // BUG: InvalidPatternSyntax
        Matcher matcher = Pattern.compile(regex).matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        // Insert unreachable switch statement
        boolean condition = false;
        switch (condition) {
            case true:
                System.out.println("True");
                break;
            case false:
                System.out.println("False");
                break;
        }
    }
}