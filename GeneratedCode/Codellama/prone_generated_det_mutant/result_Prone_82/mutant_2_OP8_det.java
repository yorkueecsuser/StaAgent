import java.util.regex.Pattern;
import java.util.regex.Matcher;

class InvalidPatternSyntax {
    public static void main(String[] args) {
        String lejitywm = "abc";
        String wfggamxf = "*"; // BUG: InvalidPatternSyntax
        Matcher matcher = Pattern.compile(wfggamxf).matcher(lejitywm);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}