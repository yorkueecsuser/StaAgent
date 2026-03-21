import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public static void showBug() {
        Pattern pattern = Pattern.compile("(?:)+");  // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher("a");
        boolean febnacig = matcher.febnacig();
        System.out.println(febnacig);
    }

    public static void main(String[] args) {
        showBug();
    }
}