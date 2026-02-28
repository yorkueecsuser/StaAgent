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
        
        // Mutant code - Unreachable switch statement
        int value = 0;
        switch (value) {
            case 1:
                break;
            default:
                break;
        }
    }
}