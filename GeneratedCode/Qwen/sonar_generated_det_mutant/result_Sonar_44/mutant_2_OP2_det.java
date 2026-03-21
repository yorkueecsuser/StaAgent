import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBugExample {
public String showBug(String input){
    Pattern pattern = Pattern.compile("[ab]|a");
    Matcher matcher = pattern.matcher(input);
    matcher = pattern.matcher(input);
    StringBuilder result = new StringBuilder();
    while(matcher.find()){ result.append(matcher.group() ).append(" "); }
    return result.toString().trim();
}

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("abc")); // Output will be "a b a"
    }
}