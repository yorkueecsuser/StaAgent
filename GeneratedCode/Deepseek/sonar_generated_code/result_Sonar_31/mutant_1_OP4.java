import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Pattern pattern = Pattern.compile("(?=a)b");
        Matcher matcher = pattern.matcher("b");
        boolean match = matcher.find();
        System.out.println(match);

        // Mutant Code: Adding an unreachable if-else statement
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            System.out.println("This statement is unreachable.");
        } else {
            System.out.println("This statement is reachable.");
        }
    }
}