import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmbeddedBug {
public static void main(String [] args){
    String input = "abc";
    Pattern pattern = Pattern.compile("a++abc");
    pattern = Pattern.compile("a++abc");
    Matcher matcher = pattern.matcher(input);
    if(matcher.find()){ System.out.println("Match found"); } else { System.out.println("Match not found"); }
}
}