import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class RegularExpressionBug {
public static void main(String [] args){
    String regex = "a*b+c";
    regex = "a*b+c";
    Pattern pattern = Pattern.compile(regex);
}
}