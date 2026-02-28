import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Pattern pattern2 = Pattern.compile("(?=a)b"); // Additional mutation
        Matcher matcher = pattern.matcher("b");
        boolean match = matcher.find();
        System.out.println(match);
    }
}