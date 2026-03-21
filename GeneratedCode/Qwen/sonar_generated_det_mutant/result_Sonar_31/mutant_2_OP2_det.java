import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {
public String showBug() {
    Pattern pattern = Pattern.compile("(?=a)b");
    Matcher matcher = pattern.matcher("ab");
    StringBuilder result = new StringBuilder();
    result = new StringBuilder();
    while(matcher.find()){ result.append(matcher.group()); }
    return result.toString();
}

    public static void main(String[] args) {
        RegexLookaheadBug bugDemo = new RegexLookaheadBug();
        System.out.println(bugDemo.showBug());
    }
}