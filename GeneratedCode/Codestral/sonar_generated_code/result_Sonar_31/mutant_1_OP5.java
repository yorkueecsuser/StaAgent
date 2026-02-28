import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    // BUG: Regex lookahead assertions should not be contradictory
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?=a)b");
        Matcher matcher = pattern.matcher(input);

        // Inserted unreachable switch statement
        boolean shouldRun = false;
        if (shouldRun) {
            int value = getValue();
            switch(value) {
                case 1:
                    // Code that will never run
                    System.out.println("This is an unreachable switch case");
                    break;
            }
        }

        return matcher.find();
    }

    private int getValue() {
        // Return a value that will not match any case in the switch statement
        return 2;
    }

    public static void main(String[] args) {
        RegexLookaheadBug bug = new RegexLookaheadBug();
        System.out.println(bug.showBug("ab"));
    }
}