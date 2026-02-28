import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Pattern pattern = Pattern.compile("(?=a)b");
        Matcher matcher = pattern.matcher("b");
        boolean match = matcher.find();
        System.out.println(match);
        
        // Mutant 1: Unreachable for loop
        Random rand = new Random();
        boolean conditionFor = rand.nextBoolean();
        for (int i = 0; conditionFor; i++) {
            // Do nothing
        }
    }
}