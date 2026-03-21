import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundariesBug {

    // Noncompliant code example
public String showBug() {
    Pattern pattern = Pattern.compile("$[a-z]+^");
    Matcher matcher = pattern.matcher("test");
    matcher = pattern.matcher("test");
    if(matcher.find()){ return matcher.group(); }
    return "No match found";
}

    public static void main(String[] args) {
        RegexBoundariesBug bug = new RegexBoundariesBug();
        System.out.println(bug.showBug());
    }
}