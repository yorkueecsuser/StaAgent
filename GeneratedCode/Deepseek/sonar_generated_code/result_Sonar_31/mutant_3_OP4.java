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

        if (false) {
            // This block is unreachable but still syntactically correct
            System.out.println("This block will never be executed.");
        } else {
            // This block is the alternative for the unreachable block
            System.out.println("This block is reachable and will be executed.");
        }
    }
}