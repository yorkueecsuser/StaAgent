import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
public static void showBug() {
    Pattern pattern = Pattern.compile("(?:)+");
    Matcher matcher = pattern.matcher("a");
    matcher = pattern.matcher("a");
    boolean matches = matcher.matches();
    System.out.println(matches);
}

    public static void main(String[] args) {
        showBug();
    }
}