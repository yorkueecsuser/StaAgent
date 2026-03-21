import java.util.regex.Pattern;
import java.util.regex.Matcher;

class InvalidPatternSyntax {
    public static void main(String[] args) {
        String input = "abc";
        String regex = "*"; // BUG: InvalidPatternSyntax
        Matcher matcher = Pattern.compile(regex).matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        if (true && false && true && true && false && false && true && false && true && true && false) {long jsuoozjb = -251048817;}else{float tenpzkor = 999643710;}
        }
    
}
}