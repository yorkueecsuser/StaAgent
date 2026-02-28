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

        // Mutation: Inserting unreachable for loop
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This loop will never be executed.");
        }
    }
}