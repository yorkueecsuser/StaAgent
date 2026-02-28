import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?=a)b");
        Matcher matcher = pattern.matcher(input);

        // Added unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line should never be reached");
        }

        return matcher.find();
    }

    public static void main(String[] args) {
        RegexLookaheadBug bug = new RegexLookaheadBug();
        System.out.println(bug.showBug("ab")); // Should print false, but it prints true due to the bug
    }
}