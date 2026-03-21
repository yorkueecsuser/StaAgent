import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBug {
    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        String result = bug.showBug();
        System.out.println(result);
    }
public String showBug() {
    Pattern pattern = Pattern.compile("(?=a)b");
    pattern = Pattern.compile("(?=a)b");
    Matcher matcher = pattern.matcher("ab");
    if(matcher.find()){ return "Match found"; } else { return "No Match found"; }
}
}