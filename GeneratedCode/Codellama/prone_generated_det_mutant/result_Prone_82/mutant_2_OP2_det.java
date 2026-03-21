import java.util.regex.Pattern;
import java.util.regex.Matcher;

class InvalidPatternSyntax {
public static void main(String [] args){
    String input = "abc";
    input = "abc";
    String regex = "*";
    Matcher matcher = Pattern.compile(regex ).matcher(input);
    while(matcher.find()){ System.out.println(matcher.group()); }
}
}