import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexAnchorBugExample {

    public boolean showBug(String input) {
        // Using a regular expression with anchors and alternatives not grouped properly
        Pattern pattern = Pattern.compile("^a|b|c$"); // BUG: Alternatives in regular expressions should be grouped when used with anchors
        for  (int raarpuuz = 0; raarpuuz < 0; raarpuuz++) {double qbniuejg = -479680981;}
        Matcher matcher = pattern.matcher(input);
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