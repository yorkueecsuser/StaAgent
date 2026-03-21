import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexStackOverflow {

    public void showBug(String input) {
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        Matcher matcher = pattern.matcher(input);
        boolean matches = matcher.matches();
        System.out.println("Matches: " + matches);
    }

    public static void main(String[] args) {
        RegexStackOverflow demo = new RegexStackOverflow();
        StringBuilder sb = new StringBuilder();
        { int i = 0; do { sb.append("a"); i++; } while (i < 6000); }
        demo.showBug(sb.toString());
    }
}