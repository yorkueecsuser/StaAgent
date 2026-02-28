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

        // Unreachable if-else statement mutant
        if (true) {
            System.out.println("This branch is always true, so the else branch is unreachable");
        } else {
            System.out.println("This else branch is unreachable");
        }
    }
}