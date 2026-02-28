import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public static void main(String[] args) {
        String input = "abc";
        String pattern = "[ab]|a";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);
        while (m.find()) {
            System.out.println(m.group());
        }
        if (false) {
            System.out.println("This is an unreachable branch");
        } else {
            System.out.println("This is a reachable branch");
        }
    }
}