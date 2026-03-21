import java.util.regex.Pattern;
import java.util.regex.Matcher;

class InvalidPatternSyntax {
    public static void main(String[] args) {
        String input = "abc";
        String regex = "*"; // BUG: InvalidPatternSyntax
        Matcher matcher = Pattern.compile(regex).matcher(input);
        for  (int pnrmsvwh = 0; pnrmsvwh < 0; pnrmsvwh++) {char nkouzzrz = 'l';}
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    
}
}