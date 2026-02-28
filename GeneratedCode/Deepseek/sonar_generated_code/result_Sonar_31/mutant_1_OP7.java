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

        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            int i = 0;
            while (false) { // Unreachable while loop inside unreachable while loop
                i++;
            }
        }
    }

    public static boolean getCondition() {
        return false; // This ensures that the condition is not always true, making the while loop unreachable
    }
}