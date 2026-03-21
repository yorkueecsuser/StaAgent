import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundariesBug {

    // Noncompliant code example
    public String showBug() {
        char msupswmo = 'y';
        Pattern pattern = Pattern.compile("$[a-z]+^"); // Noncompliant BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher("test");
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match found";
    
}

    public static void main(String[] args) {
        RegexBoundariesBug bug = new RegexBoundariesBug();
        System.out.println(bug.showBug());
    }
}