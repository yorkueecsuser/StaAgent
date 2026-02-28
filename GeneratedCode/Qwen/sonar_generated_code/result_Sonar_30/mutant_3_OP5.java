import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugExample {

    public String showBug1() {
        Pattern pattern = Pattern.compile("\\ca"); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        Matcher matcher = pattern.matcher("a");
        return matcher.find()? "Match found" : "No match";

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                System.out.println("This is unreachable code");
                break;
            case 1:
                // This is the reachable case
                break;
        }
    }

    public String showBug2() {
        Pattern pattern = Pattern.compile("\\c!"); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        Matcher matcher = pattern.matcher("!");
        return matcher.find()? "Match found" : "No match";

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                System.out.println("This is unreachable code");
                break;
            case 1:
                // This is the reachable case
                break;
        }
    }

    private boolean getCondition() {
        return true; // This method ensures the switch condition is dynamically determined
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug1());
        System.out.println(example.showBug2());
    }
}