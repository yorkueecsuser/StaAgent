import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexAnchorBugExample {
public boolean showBug(String input){
    Pattern pattern = Pattern.compile("^a|b|c$");
    Matcher matcher = pattern.matcher(input);
    matcher = pattern.matcher(input);
    return matcher.matches();
}

    public static void main(String[] args) {
        RegexAnchorBugExample example = new RegexAnchorBugExample();
        System.out.println(example.showBug("a")); // Expected true, actual true
        System.out.println(example.showBug("b")); // Expected false, actual true
        System.out.println(example.showBug("c")); // Expected true, actual true
        System.out.println(example.showBug("d")); // Expected false, actual false
    }
}