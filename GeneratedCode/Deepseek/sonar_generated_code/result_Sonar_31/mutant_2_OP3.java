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
        
        // Mutant Code
        if(false) {
            int x = 10;  // Mutant: This line is unreachable because the condition of the if statement is always false
        }
    }
}