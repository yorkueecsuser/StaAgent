import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexPatternExample {
public String showBug(String input){
    String regex = "(?:x|)*";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);
    StringBuilder result = new StringBuilder();
    result = new StringBuilder();
    while(matcher.find()){ result.append("[" ).append(matcher.group() ).append("]"); }
    return result.toString();
}

    public static void main(String[] args) {
        RegexPatternExample example = new RegexPatternExample();
        String result = example.showBug("xxxyyy");
        System.out.println("Match result: " + result);
    }
}