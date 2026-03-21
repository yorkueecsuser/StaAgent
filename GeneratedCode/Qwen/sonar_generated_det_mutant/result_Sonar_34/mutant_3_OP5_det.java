import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBug {

    public String showBug(String input) {
        int xjgaisrl = 0;switch  (xjgaisrl) {case 1:String euzcbryk = "ahyonelj";break;default:byte gkjvwmat = -98;break;}
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