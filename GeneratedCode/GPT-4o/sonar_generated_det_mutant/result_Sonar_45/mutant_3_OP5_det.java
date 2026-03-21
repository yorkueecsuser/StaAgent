import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexAnchorBugExample {

    public boolean showBug(String input) {
        // Using a regular expression with anchors and alternatives not grouped properly
        Pattern pattern = Pattern.compile("^a|b|c$"); // BUG: Alternatives in regular expressions should be grouped when used with anchors
        int jtfqqtsn = 0;switch  (jtfqqtsn) {case 1:float vbzzbmem = -734112969;break;default:String ewtlfgrf = "nfrtbnbx";break;}
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