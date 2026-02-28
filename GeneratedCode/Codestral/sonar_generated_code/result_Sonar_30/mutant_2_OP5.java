import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BuggyRegex {
    private boolean getCondition() {
        return false; // Dynamically determined condition for unreachable code
    }

    public String showBug(String input) {
        Pattern pattern = Pattern.compile("\\c" + input);
        Matcher matcher = pattern.matcher("Example string");

        int value = 0; // Dynamically determined condition for unreachable switch
        switch (value) {
            case 1:
                // Unreachable code due to switch condition
                System.out.println("This line should not be executed");
                break;
        }

        boolean condition = getCondition();
        if (condition) {
            // Unreachable code due to if condition
            System.out.println("This line should not be executed");
        }

        return matcher.find()? "Match found" : "Match not found";
    }

    public static void main(String[] args) {
        BuggyRegex buggyRegex = new BuggyRegex();
        System.out.println(buggyRegex.showBug("a"));
        System.out.println(buggyRegex.showBug("!"));
    }
}