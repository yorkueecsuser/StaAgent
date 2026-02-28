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

        // Unreachable for loop
        for (int i = 0; false; i++) {
            // Unreachable code
            System.out.println("This line of code is unreachable.");
        }
    }
}