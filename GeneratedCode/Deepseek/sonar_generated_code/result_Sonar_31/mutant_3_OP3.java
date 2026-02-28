import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Matcher matcher = pattern.matcher("b");
        boolean match = matcher.find();
        System.out.println(match);
        if (alwaysFalse()) { // Mutant: Unreachable if statement
            System.out.println("This line of code is unreachable");
        }
    }

    public static boolean alwaysFalse() {
        return false;
    }
}