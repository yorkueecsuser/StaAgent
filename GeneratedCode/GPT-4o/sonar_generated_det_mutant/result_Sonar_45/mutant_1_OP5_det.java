import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexAnchorBugExample {

    public boolean showBug(String input) {
        // Using a regular expression with anchors and alternatives not grouped properly
        Pattern pattern = Pattern.compile("^a|b|c$"); // BUG: Alternatives in regular expressions should be grouped when used with anchors
        int ghspuadm = 0;switch  (ghspuadm) {case 1:int pecnqbbp = 616519281;break;default:float xbimjshx = 983108148;break;}
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