import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBugExample {
public String showBug(String input){
    Pattern pattern = Pattern.compile("$[a-z]+^");
    Matcher matcher = pattern.matcher(input);
    matcher = pattern.matcher(input);
    if(matcher.find()){ return "Match found: " + matcher.group(); } else { return "No match found"; }
}

    public static void main(String[] args) {
        RegexBoundaryBugExample example = new RegexBoundaryBugExample();
        String result = example.showBug("exampletext");
        System.out.println(result);
    }
}