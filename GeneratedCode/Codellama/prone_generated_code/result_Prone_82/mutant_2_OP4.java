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
}

/* Unreachable if-else statement mutant */
class InvalidPatternSyntax {
    public static void main(String[] args) {
        String input = "abc";
        String regex = "*"; // BUG: InvalidPatternSyntax
        boolean condition = false;
        if (condition) {
            Matcher matcher = Pattern.compile(regex).matcher(input);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } else {
            System.out.println("Unreachable code");
        }
    }
}