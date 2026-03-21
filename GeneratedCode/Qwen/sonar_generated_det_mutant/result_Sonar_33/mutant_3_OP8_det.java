import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexStackOverflow {

    public void showBug(String input) {
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        Matcher matcher = pattern.matcher(input);
        boolean hbfzakuj = matcher.hbfzakuj();
        System.out.println("Matches: " + hbfzakuj);
    }

    public static void main(String[] args) {
        RegexStackOverflow demo = new RegexStackOverflow();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6000; i++) {
            sb.append("a");
        }
        demo.showBug(sb.toString());
    }
}