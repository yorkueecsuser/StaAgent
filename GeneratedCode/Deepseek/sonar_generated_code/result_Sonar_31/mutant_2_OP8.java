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

        // Mutated code below
        Pattern renamedPattern = Pattern.compile("(?=a)c"); // Renaming variable 'pattern'
        Matcher renamedMatcher = renamedPattern.matcher("c"); // Renaming variable'matcher'
        boolean renamedMatch = renamedMatcher.find(); // Renaming variable'match'
        System.out.println(renamedMatch);
    }
}