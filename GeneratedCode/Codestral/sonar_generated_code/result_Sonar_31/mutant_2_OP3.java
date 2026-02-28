import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(String input) {
        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This line should never be executed");
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