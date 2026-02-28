import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugExample {

    public String showBug1() {
        Pattern pattern = Pattern.compile("\\ca"); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        Matcher matcher = pattern.matcher("a");
        
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intentionally left empty to be unreachable
        } else {
            // This block is also intentionally left empty to be unreachable
        }
        
        return matcher.find()? "Match found" : "No match";
    }

    public String showBug2() {
        Pattern pattern = Pattern.compile("\\c!"); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        Matcher matcher = pattern.matcher("!");
        
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intentionally left empty to be unreachable
        } else {
            // This block is also intentionally left empty to be unreachable
        }
        
        return matcher.find()? "Match found" : "No match";
    }

    private boolean getCondition() {
        // This method returns a condition that is always false, ensuring the if-else branches are unreachable
        return false;
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug1());
        System.out.println(example.showBug2());
    }
}