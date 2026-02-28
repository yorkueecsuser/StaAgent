import java.util.regex.Pattern;
import java.util.regex.Matcher;

class InvalidPatternSyntax {
    public static void main(String[] args) {
        String input = "abc";
        String regex = "*";
        Matcher matcher = Pattern.compile(regex).matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        String regex2 = "*";
        Matcher matcher2 = Pattern.compile(regex2).matcher(input);
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }
    }
}