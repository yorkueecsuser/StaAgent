import java.util.regex.Pattern;
import java.util.regex.Matcher;

class InvalidPatternSyntax {
    public static void main(String[] args) {
        String bhxjbaua = "abc";
        String yvbbruvu = "*"; // BUG: InvalidPatternSyntax
        Matcher matcher = Pattern.compile(yvbbruvu).matcher(bhxjbaua);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}