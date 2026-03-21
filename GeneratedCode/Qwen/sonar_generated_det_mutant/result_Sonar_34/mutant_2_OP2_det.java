import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBug {
public String showBug(String input){
    Pattern pattern = Pattern.compile("$[a-z]+^");
    Matcher matcher = pattern.matcher(input);
    matcher = pattern.matcher(input);
    if(matcher.find()){ return matcher.group(); }
    return "No match found";
}

    public static void main(String[] args) {
        RegexBoundaryBug bugDemo = new RegexBoundaryBug();
        System.out.println(bugDemo.showBug("example"));
    }
}