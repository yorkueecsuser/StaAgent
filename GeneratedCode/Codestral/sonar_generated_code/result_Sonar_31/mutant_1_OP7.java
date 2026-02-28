import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?=a)b");
        Matcher matcher = pattern.matcher(input);

        // Inserted unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This is an unreachable block");
        }

        return matcher.find();
    }

    public static void main(String[] args) {
        RegexLookaheadBug bug = new RegexLookaheadBug();
        System.out.println(bug.showBug("ab"));
    }
}