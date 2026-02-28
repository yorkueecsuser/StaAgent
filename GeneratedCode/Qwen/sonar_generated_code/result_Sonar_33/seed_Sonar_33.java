import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexStackOverflowExample {

    public void showBug(String input) {
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        Matcher matcher = pattern.matcher(input);
        boolean matches = matcher.matches();
        System.out.println("Matches: " + matches);
    }

    public static void main(String[] args) {
        RegexStackOverflowExample example = new RegexStackOverflowExample();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6000; i++) {
            sb.append("a");
        }
        example.showBug(sb.toString());
    }
}