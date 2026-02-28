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

        // mutation operator: Unreachable if-else statement
        if (false) {
            // unreachable code
            System.out.println("This code will never be executed.");
        } else {
            // this code will be executed
            System.out.println("This code will always be executed.");
        }
    }
}