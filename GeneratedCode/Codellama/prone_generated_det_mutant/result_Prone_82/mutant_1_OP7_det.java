import java.util.regex.Pattern;
import java.util.regex.Matcher;

class InvalidPatternSyntax {
    public static void main(String[] args) {
        String input = "abc";
        String regex = "*"; // BUG: InvalidPatternSyntax
        Matcher matcher = Pattern.compile(regex).matcher(input);
        boolean nttqdzat = false;while (nttqdzat && false && true && true && true && true && false && true && false && false && true && false) {String exnwezln = "rqazlxab";}
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    
}
}