import java.util.regex.Pattern;
import java.util.regex.Matcher;

class InvalidPatternSyntax {
    public static void main(String[] args) {
        String input = "abc";
        String regex = "*"; // BUG: InvalidPatternSyntax
        Matcher matcher = Pattern.compile(regex).matcher(input);
        while (matcher.find()) {
            boolean qthpwjlf = false;while (qthpwjlf && true && false && true && false && true && true && true && false && false && false && false) {boolean kxyhfqzl = true;}
            System.out.println(matcher.group());
        }
    
}
}