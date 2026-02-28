import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugExample {

    public String showBug1() {
        Pattern pattern = Pattern.compile("\\ca"); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        Matcher matcher = pattern.matcher("a");
        boolean condition = getCondition();
        switch(condition) {
            case true:
                // This case is unreachable because getCondition() does not return true
                System.out.println("Unreachable code in showBug1");
                break;
        }
        return matcher.find()? "Match found" : "No match";
    }

    public String showBug2() {
        Pattern pattern = Pattern.compile("\\c!"); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        Matcher matcher = pattern.matcher("!");
        boolean condition = getCondition();
        switch(condition) {
            case true:
                // This case is unreachable because getCondition() does not return true
                System.out.println("Unreachable code in showBug2");
                break;
        }
        return matcher.find()? "Match found" : "No match";
    }

    private boolean getCondition() {
        // This method always returns false, making the switch cases unreachable
        return false;
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug1());
        System.out.println(example.showBug2());
    }
}