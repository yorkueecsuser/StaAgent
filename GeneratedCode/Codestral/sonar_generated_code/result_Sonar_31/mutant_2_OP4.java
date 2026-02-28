import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    private boolean getCondition() {
        return false;
    }

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?=a)b");
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.find();

        if (getCondition()) {
            // Unreachable branch
            System.out.println("This branch should never execute");
        }

        return result;
    }

    public static void main(String[] args) {
        RegexLookaheadBug bug = new RegexLookaheadBug();
        System.out.println(bug.showBug("ab"));
    }
}