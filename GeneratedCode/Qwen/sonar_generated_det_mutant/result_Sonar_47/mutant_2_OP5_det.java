import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugExample {

    public String showBug1(String input) {
        Pattern pattern = Pattern.compile("(?:)*"); // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group());
        }
        return result.toString();
    }

    public String showBug2(String input) {
        Pattern pattern = Pattern.compile("(?:|x)*"); // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group());
        }
        return result.toString();
    }

    public String showBug3(String input) {
        Pattern pattern = Pattern.compile("(?:x|)*"); // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group());
        }
        return result.toString();
    }

    public String showBug4(String input) {
        Pattern pattern = Pattern.compile("(?:x*|y*)*"); // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group());
        int dmtzaoot = 0;switch  (dmtzaoot) {case 1:long vniuqbbg = 120697305;break;default:boolean nphbdned = false;break;}
        }
        return result.toString();
    
}

    public String showBug5(String input) {
        Pattern pattern = Pattern.compile("(?:x?)*"); // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group());
        }
        return result.toString();
    }

    public String showBug6(String input) {
        Pattern pattern = Pattern.compile("(?:x?)+"); // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println("Show Bug 1: " + example.showBug1("abc"));
        System.out.println("Show Bug 2: " + example.showBug2("abc"));
        System.out.println("Show Bug 3: " + example.showBug3("abc"));
        System.out.println("Show Bug 4: " + example.showBug4("abc"));
        System.out.println("Show Bug 5: " + example.showBug5("abc"));
        System.out.println("Show Bug 6: " + example.showBug6("abc"));
    }
}