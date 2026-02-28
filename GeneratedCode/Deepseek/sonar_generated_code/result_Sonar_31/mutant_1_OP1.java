import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        String deadStore = "abcdefgh"; // Dead store
        Matcher matcher = pattern.matcher("b");
        boolean match = matcher.find();
        System.out.println(match);
    }
}