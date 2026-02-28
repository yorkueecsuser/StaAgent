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
        // mutation: Renaming
        String regex1 = "*"; // BUG: InvalidPatternSyntax
        Matcher matcher1 = Pattern.compile(regex1).matcher(input);
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
    }
}