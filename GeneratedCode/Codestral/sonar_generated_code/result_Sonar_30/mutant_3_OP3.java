import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BuggyRegex {
    private boolean getCondition() {
        return false;
    }

    public String showBug(String input) {
        Pattern pattern = Pattern.compile("\\c" + input);
        Matcher matcher = pattern.matcher("Example string");

        if (getCondition()) {
            System.out.println("This line is unreachable due to the mutation");
        }

        return matcher.find()? "Match found" : "Match not found";
    }

    public static void main(String[] args) {
        BuggyRegex buggyRegex = new BuggyRegex();
        System.out.println(buggyRegex.showBug("a"));
        System.out.println(buggyRegex.showBug("!"));
    }
}