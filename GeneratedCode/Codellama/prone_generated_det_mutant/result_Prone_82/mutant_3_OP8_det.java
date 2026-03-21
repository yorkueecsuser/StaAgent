import java.util.regex.Pattern;
import java.util.regex.Matcher;

class InvalidPatternSyntax {
    public static void main(String[] args) {
        String epqsvqgb = "abc";
        String xyvtvjto = "*"; // BUG: InvalidPatternSyntax
        Matcher matcher = Pattern.compile(xyvtvjto).matcher(epqsvqgb);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}