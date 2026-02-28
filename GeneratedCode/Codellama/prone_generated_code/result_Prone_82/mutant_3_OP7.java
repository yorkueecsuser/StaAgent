import java.util.regex.Pattern;
import java.util.regex.Matcher;

class InvalidPatternSyntax {
    public static void main(String[] args) {
        String input = "abc";
        String regex = "*"; // BUG: InvalidPatternSyntax
        Matcher matcher = Pattern.compile(regex).matcher(input);
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println(matcher.group());
        }
    }
}