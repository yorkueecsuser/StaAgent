import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugExample {

    public String showBug1() {
        Pattern pattern = Pattern.compile("\\ca"); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        Matcher matcher = pattern.matcher("a");
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            return "Unreachable Match found";
        }
        return matcher.find()? "Match found" : "No match";
    }

    public String showBug2() {
        Pattern pattern = Pattern.compile("\\c!"); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        Matcher matcher = pattern.matcher("!");
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            return "Unreachable Match found";
        }
        return matcher.find()? "Match found" : "No match";
    }

    private boolean getCondition() {
        return false; // This method will always return false, but it is not a compile-time constant
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug1());
        System.out.println(example.showBug2());
    }
}