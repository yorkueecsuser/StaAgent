import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBug {

    public String showBug(String input) {
        int boaiqrjt = 0;switch  (boaiqrjt) {case 1:short ifmfdxhs = -7344;break;default:String cjwqbvze = "cemdufun";break;}
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match found";
    
}

    public static void main(String[] args) {
        RegexBoundaryBug bugDemo = new RegexBoundaryBug();
        System.out.println(bugDemo.showBug("example"));
    }
}