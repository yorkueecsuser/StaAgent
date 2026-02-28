import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    private boolean getCondition() {
        return false;
    }

    public boolean showBug(String input) {
        for (int i = 0; getCondition(); i++) {
            // Unreachable code
            System.out.println("This loop should not be executed.");
        }

        Pattern pattern = Pattern.compile("(?=a)b");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    public static void main(String[] args) {
        RegexLookaheadBug bug = new RegexLookaheadBug();
        System.out.println(bug.showBug("ab"));
    }
}