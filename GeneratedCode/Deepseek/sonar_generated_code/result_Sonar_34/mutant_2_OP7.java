import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugExample {
    public static void main(String[] args) {
        RegexBugExample rbe = new RegexBugExample();
        rbe.showBug();
    }

    public String showBug() {
        String nonCompliantPattern = "$[a-z]+^";
        Pattern pattern = Pattern.compile(nonCompliantPattern);
        Matcher matcher = pattern.matcher("test");
        if (matcher.find()) {
            while (false) { /* Unreachable code */ } // Unreachable while loop mutant
            return matcher.group();
        }
        return null;
    }
}