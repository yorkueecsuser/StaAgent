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

        // Added unreachable for loop
        boolean condition = false; // non-final variable for mutation
        for(int i=0; i<0; i++) {
            condition = true;
        }
        if(condition) {
            System.out.println("Unreachable code!");
        }
    }
}