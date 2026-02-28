import java.util.regex.Pattern;
import java.util.regex.Matcher;

class InvalidPatternSyntax {
    public static void main(String[] args) {
        String input = "abc";
        String regex = "*"; // BUG: InvalidPatternSyntax
        String deadStore = "deadStore"; // Dead Store
        Matcher matcher = Pattern.compile(regex).matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}